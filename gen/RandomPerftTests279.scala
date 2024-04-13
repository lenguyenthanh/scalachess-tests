import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests279 extends SimpleIOSuite:

  test("random.perft - part 279") {
    Perft
      .perfts(Perft.randomPerfts(279), Chess960)
      .map(assert(_))
  }
