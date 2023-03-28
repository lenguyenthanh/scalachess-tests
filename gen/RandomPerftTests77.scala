import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests77 extends SimpleIOSuite:

  test("random.perft - part 77") {
    Perft
      .perfts(Perft.randomPerfts(77), Chess960)
      .map(assert(_))
  }
