import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests575 extends SimpleIOSuite:

  test("random.perft - part 575") {
    Perft
      .perfts(Perft.randomPerfts(575), Chess960)
      .map(assert(_))
  }
