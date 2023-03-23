//> using scala "3.2.2"
//> using repository "https://raw.githubusercontent.com/lichess-org/lila-maven/master"
//> using lib "org.lichess::scalachess:14.6.3"
//> using lib "com.disneystreaming::weaver-cats:0.8.1"
//> using testFramework "weaver.framework.CatsEffect"

import weaver.*

import chess.format.EpdFen
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
