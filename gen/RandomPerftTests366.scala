import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests366 extends SimpleIOSuite:

  test("random.perft - part 366") {
    Perft
      .perfts(Perft.randomPerfts(366), Chess960)
      .map(assert(_))
  }
