import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests75 extends SimpleIOSuite:

  test("random.perft - part 75") {
    Perft
      .perfts(Perft.randomPerfts(75), Chess960)
      .map(assert(_))
  }
