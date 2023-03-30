import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests590 extends SimpleIOSuite:

  test("random.perft - part 590") {
    Perft
      .perfts(Perft.randomPerfts(590), Chess960)
      .map(assert(_))
  }
