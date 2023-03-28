import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests301 extends SimpleIOSuite:

  test("random.perft - part 301") {
    Perft
      .perfts(Perft.randomPerfts(301), Chess960)
      .map(assert(_))
  }
