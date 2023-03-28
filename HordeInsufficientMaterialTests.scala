import cats.effect.{ IO, IOApp }
import cats.syntax.all.*
import cats.effect.syntax.all.*
import fs2.*
import fs2.io.file.Files

import weaver.*

import chess.format.Fen
import chess.format.EpdFen
import chess.variant.*

import Common.given

object HordeInsufficientMaterialTests extends SimpleIOSuite:

  test("insufficient material tests") {
    run("resources/horde_insufficient_material.csv", Horde)
      .map(assert(_))
  }

  private def run(file: String, variant: Variant): IO[Boolean] =
    parser(file)
      .foldMap(_.run(variant))
      .compile
      .toList
      .map(_.head)

  private def parser(file: String): Stream[IO, Case] =
    Files[IO]
      .readAll(fs2.io.file.Path(file))
      .through(csvParser)
      .map(parseSample)

  private def csvParser[F[_]]: Pipe[F, Byte, List[String]] =
    _.through(text.utf8Decode)
      .through(text.lines)
      .filter(_.nonEmpty)
      .map(_.split(',').toList)

  private def parseSample(sample: List[String]): Case =
    Case(EpdFen(sample(0)), sample(1).toBoolean, sample.get(2))

private case class Case(fen: EpdFen, expected: Boolean, comment: Option[String]) {
  def run(variant: Variant): Boolean =
    val situation = Fen.read(variant, fen).get
    Horde.hasInsufficientMaterial(situation.board, !situation.color) == expected
}
