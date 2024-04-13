import weaver.*

import chess.format.FullFen
import chess.variant.*

object VariantPerftTests extends SimpleIOSuite:

  test("threeCheck.perft") {
    Perft
      .perfts(Perft.threeCheckPerfts, ThreeCheck)
      .map(assert(_))
  }

  test("antichess.perft") {
    Perft
      .perfts(Perft.antichessPerfts, Antichess)
      .map(assert(_))
  }

  test("atomic.perft") {
    Perft
      .perfts(Perft.atomicPerfts, Atomic)
      .map(assert(_))
  }

  test("crazyhouse.perft") {
    Perft
      .perfts(Perft.crazyhousePerfts, Crazyhouse)
      .map(assert(_))
  }

  test("horde.perft") {
    Perft
      .perfts(Perft.hordePerfts, Horde)
      .map(assert(_))
  }

  test("racingkings.perft") {
    Perft
      .perfts(Perft.racingkingsPerfts, RacingKings)
      .map(assert(_))
  }
