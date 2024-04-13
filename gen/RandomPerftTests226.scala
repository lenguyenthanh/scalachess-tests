import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests226 extends SimpleIOSuite:

  test("random.perft - part 226") {
    Perft
      .perfts(Perft.randomPerfts(226), Chess960)
      .map(assert(_))
  }
