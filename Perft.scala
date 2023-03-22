//> using scala "3.2.2"
//> using repository "https://raw.githubusercontent.com/lichess-org/lila-maven/master"
//> using lib "org.lichess::scalachess:14.6.3"

import scala.io.Source
import chess.format.EpdFen
import chess.variant.Chess960
import chess.variant.Variant
import chess.variant.Crazyhouse
import chess.{ MoveOrDrop, Situation }
import chess.MoveOrDrop.*
import chess.format.Fen

case class Perft(id: String, epd: EpdFen, cases: List[TestCase]):
  import Perft.*
  def calculate(variant: Variant): List[Result] =
    val situation =
      Fen.read(variant, epd).getOrElse { throw RuntimeException(s"Invalid fen: $epd for variant: $variant") }
    cases.map(c => Result(c.depth, situation.perft(c.depth), c.result))

  def withLimit(limit: Long): Perft =
    copy(cases = cases.filter(_.result < limit))

case class TestCase(depth: Int, result: Long)
case class Result(depth: Int, result: Long, expected: Long)

case class DivideResult(val move: MoveOrDrop, nodes: Long) {
  override def toString(): String =
    s"${move.toUci.uci} $nodes"
}

object Perft:

  lazy val threeCheckPerfts  = Perft.read("resources/3check.perft")
  lazy val antichessPerfts   = Perft.read("resources/antichess.perft")
  lazy val atomicPerfts      = Perft.read("resources/atomic.perft")
  lazy val crazyhousePerfts  = Perft.read("resources/crazyhouse.perft")
  lazy val hordePerfts       = Perft.read("resources/horde.perft")
  lazy val racingkingsPerfts = Perft.read("resources/racingkings.perft")
  lazy val randomPerfts      = Perft.read("resources/random.perft")
  lazy val trickyPerfts      = Perft.read("resources/tricky.perft")
  lazy val chess960          = Perft.read("resources/chess960.perft")

  private def read(file: String): List[Perft] =
    import cats.implicits.toShow
    val str = Source.fromFile(file).mkString
    PerftParser.parse(str).fold(ex => throw RuntimeException(s"Parsing error: $file: ${ex.show}"), identity)

  def printResult(results: List[DivideResult]) =
    val builder = StringBuilder()
    var sum     = 0L
    results.foreach { r =>
      sum += r.nodes
      builder.append(r).append("\n")
    }
    builder.append("\n").append(sum)
    println(builder)

  extension (s: Situation)

    def divide(depth: Int): List[DivideResult] =
      if depth == 0 then Nil
      else if s.perftEnd then Nil
      else
        s.perftMoves
          .map { move =>
            val nodes = move.situationAfter.perft(depth - 1)
            DivideResult(move, nodes)
          }
          .sortBy(_.move.toUci.uci)

    def perft(depth: Int): Long =
      if depth == 0 then 1L
      else if s.perftEnd then 0L
      else
        val moves = s.perftMoves
        if (depth == 1) then moves.size.toLong
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
