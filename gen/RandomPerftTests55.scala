import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests55 extends SimpleIOSuite:

  test("random.perft - part 55") {
    Perft
      .perfts(Perft.randomPerfts(55), Chess960)
      .map(assert(_))
  }
