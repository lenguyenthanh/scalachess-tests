import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests152 extends SimpleIOSuite:

  test("random.perft - part 152") {
    Perft
      .perfts(Perft.randomPerfts(152), Chess960)
      .map(assert(_))
  }
