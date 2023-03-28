import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests365 extends SimpleIOSuite:

  test("random.perft - part 365") {
    Perft
      .perfts(Perft.randomPerfts(365), Chess960)
      .map(assert(_))
  }
