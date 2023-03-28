import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests94 extends SimpleIOSuite:

  test("random.perft - part 94") {
    Perft
      .perfts(Perft.randomPerfts(94), Chess960)
      .map(assert(_))
  }
