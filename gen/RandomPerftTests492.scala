import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests492 extends SimpleIOSuite:

  test("random.perft - part 492") {
    Perft
      .perfts(Perft.randomPerfts(492), Chess960)
      .map(assert(_))
  }
