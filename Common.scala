import cats.kernel.Monoid

object Common:
  given Monoid[Boolean] with
    def empty                           = true
    def combine(x: Boolean, y: Boolean) = x && y

  given Monoid[Long] with
    def empty                     = 0L
    def combine(x: Long, y: Long) = x + y

import scala.io.Source
import chess.format.EpdFen
import chess.variant.Chess960
import chess.variant.Variant
import chess.variant.Crazyhouse
import chess.{ MoveOrDrop, Situation }
import chess.MoveOrDrop.*
import chess.format.Fen

import cats.syntax.all.*
import cats.effect.syntax.all.*
import cats.effect.IO

case class Perft(id: String, epd: EpdFen, cases: List[TestCase]):
  import Perft.*
  def calculate(variant: Variant): Result =
    val situation =
      Fen.read(variant, epd).getOrElse { throw RuntimeException(s"Invalid fen: $epd for variant: $variant") }
    val c = cases.last
    Result(c.depth, situation.perft(c.depth), c.result)

  def max = cases.last.result

case class TestCase(depth: Int, result: Long)
case class Result(depth: Int, result: Long, expected: Long)

case class DivideResult(val move: MoveOrDrop, nodes: Long) {
  override def toString(): String =
    s"${move.toUci.uci} $nodes"
}

object Perft:

  lazy val threeCheckPerfts  = read("resources/3check.perft")
  lazy val antichessPerfts   = read("resources/antichess.perft")
  lazy val atomicPerfts      = read("resources/atomic.perft")
  lazy val crazyhousePerfts  = read("resources/crazyhouse.perft")
  lazy val hordePerfts       = read("resources/horde.perft")
  lazy val racingkingsPerfts = read("resources/racingkings.perft")
  lazy val randomPerfts      = splitPerft("resources/random.perft", 16)
  lazy val trickyPerfts      = read("resources/tricky.perft").grouped(9).toList
  lazy val chess960          = splitPerft("resources/chess960.perft", 18)

  def splitPerft(file: String, split: Int): List[List[Perft]] =
    val all  = Perft.read(file).sortBy(_.max)
    all
      .zip(all.reverse)
      .splitAt(all.size / 2)
      ._1
      .flatMap { case (a, b) => List(a, b) }
      .grouped(split)
      .toList

  def read(file: String): List[Perft] =
    import cats.implicits.toShow
    val str = Source.fromFile(file).mkString
    PerftParser.parse(str).fold(ex => throw RuntimeException(s"Parsing error: $file: ${ex.show}"), identity)

  import Common.given
  def perfts(perfts: List[Perft], variant: Variant): IO[Boolean] =
    perfts.parFoldMapA(perftTestIO(_, variant))

  private def perftTestIO(perft: Perft, variant: Variant): IO[Boolean] =
    val situation = Fen.read(variant, perft.epd).getOrElse {
      throw RuntimeException(s"Invalid fen: ${perft.epd} for variant: $variant")
    }
    val c = perft.cases.last
    situation
      .perftIO(c.depth)
      .map(result =>
        println(s"Perft ${perft.id} ${perft.epd} ${c.depth} $result ${result == c.result}")
        result == c.result
      )

  private def perftTest(perft: Perft, variant: Variant): Boolean =
    val situation =
      Fen.read(variant, perft.epd).getOrElse {
        throw RuntimeException(s"Invalid fen: ${perft.epd} for variant: $variant")
      }
    val c = perft.cases.last
    val result = situation
      .perft(c.depth)
    println(s"Perft ${perft.id} ${perft.epd} ${c.depth} $result ${result == c.result}")
    result == c.result

  extension (s: Situation)

    def perftIO(depth: Int): IO[Long] =
      if depth == 0 then IO(1L)
      else if s.perftEnd then IO(0L)
      else
        val moves = s.perftMoves
        if depth == 1 then moves.size.toLong.pure[IO]
        else moves.foldMapA(_.situationAfter.perftIO(depth - 1))

    def perft(depth: Int): Long =
      if depth == 0 then 1L
      else if s.perftEnd then 0L
      else
        val moves = s.perftMoves
        if depth == 1 then moves.size.toLong
        else moves.map(_.situationAfter.perft(depth - 1)).sum

    private def perftMoves: List[MoveOrDrop] =
      if s.board.variant == chess.variant.Crazyhouse
      then Crazyhouse.legalMoves(s)
      else
        val legalMoves = s.legalMoves
        if s.board.variant.chess960 then legalMoves
        // if variant is not chess960 we need to deduplicated castlings moves
        // We filter out castling move that is Standard and king's dest is not in the rook position
        else legalMoves.filterNot(m => m.castle.exists(c => c.isStandard && m.dest != c.rook))

    private def crazyhousePerftMoves: List[MoveOrDrop] =
      Crazyhouse.legalMoves(s)

    // when calculate perft we don't do autoDraw
    def perftEnd = s.checkMate || s.staleMate || s.variantEnd || s.board.variant.specialDraw(s)

import cats.syntax.all.*
import cats.parse.{ LocationMap, Numbers as N, Parser as P, Parser0 as P0, Rfc5234 as R }

import chess.format.EpdFen

object PerftParser:
  def parse: String => Either[P.Error, List[Perft]] = perfts.parseAll

  private val whitespace  = R.cr | R.lf | R.wsp
  private val blank       = P.until(!whitespace)
  private val nonNegative = N.nonNegativeIntString

  private val comment = (P.caret.filter(_.col == 0) *> P.char('#')).endWith(R.lf)
  private val ignored = (comment | blank).void

  private val id: P[String]  = "id".prefix
  private val epd: P[EpdFen] = "epd".prefix.map(EpdFen.clean)
  private val testCase: P[TestCase] =
    ((nonNegative.map(_.toInt) <* P.char(' ')) ~ nonNegative.map(_.toLong)).map(TestCase.apply)
  private val oneTestCase: P[TestCase] = P.string("perft ") *> testCase <* R.lf.?
  private val cases: P[List[TestCase]] = oneTestCase.rep.map(_.toList) <* (ignored.rep | R.lf.rep0)
  private val perft: P[Perft]          = (id, epd, cases).mapN(Perft.apply) <* R.lf.?
  private val perfts: P0[List[Perft]]  = ignored.rep0 *> perft.rep.map(_.toList)

  extension (p: P0[Any]) private def endWith(p1: P[Any]): P[String] = p.with1 *> (p1.string | (P.until(p1) <* p1))

  extension (str: String) private def prefix: P[String] = P.string(s"$str ").endWith(R.lf)
