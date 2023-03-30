import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests611 extends SimpleIOSuite:

  test("random.perft - part 611") {
    Perft
      .perfts(Perft.randomPerfts(611), Chess960)
      .map(assert(_))
  }
