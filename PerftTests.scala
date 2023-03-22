//> using scala "3.2.2"
//> using lib "org.typelevel::toolkit::0.0.4"
//> using repository "https://raw.githubusercontent.com/lichess-org/lila-maven/master"
//> using lib "org.lichess::scalachess:14.6.3"

import scala.concurrent.duration.Duration

import cats.syntax.all.*
import cats.effect.syntax.all.*
import cats.effect.IO

import munit.CatsEffectSuite

import chess.format.EpdFen
import chess.variant.*

import Perft.*
import Common.given

class PerftTests extends CatsEffectSuite:

  override val munitTimeout = Duration(10, "hour")

  val nodeLimits = 10_000_000L

  test("random.perft") {
    perfts(Perft.randomPerfts, Chess960, nodeLimits)
      .map(assert(_))
  }

  test("threeCheck.perft") {
    perfts(Perft.threeCheckPerfts, ThreeCheck, nodeLimits)
      .map(assert(_))
  }

  test("antichess.perft") {
    perfts(Perft.antichessPerfts, Antichess, nodeLimits)
      .map(assert(_))
  }

  test("atomic.perft") {
    perfts(Perft.atomicPerfts, Atomic, nodeLimits)
      .map(assert(_))
  }

  test("crazyhouse.perft") {
    perfts(Perft.crazyhousePerfts, Crazyhouse, nodeLimits)
      .map(assert(_))
  }

  test("horde.perft") {
    perfts(Perft.hordePerfts, Horde, nodeLimits)
      .map(assert(_))
  }

  test("racingkings.perft") {
    perfts(Perft.racingkingsPerfts, RacingKings, nodeLimits)
      .map(assert(_))
  }

  test("tricky.perft") {
    perfts(Perft.trickyPerfts, Chess960, nodeLimits)
      .map(assert(_))
  }

  test("chess960.perft") {
    perfts(Perft.chess960, Chess960, nodeLimits)
      .map(assert(_))
  }

  private def perfts(perfts: List[Perft], variant: Variant, nodeLimit: Long): IO[Boolean] =
    perfts.parFoldMapA(perft => IO(perftTest(perft, variant, nodeLimit)))

  private def perftTest(perft: Perft, variant: Variant, nodeLimit: Long): Boolean =
    perft
      .withLimit(nodeLimit)
      .calculate(variant)
      .forall(r => r.result === r.expected)
