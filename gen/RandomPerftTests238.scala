import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests238 extends SimpleIOSuite:

  test("random.perft - part 238") {
    Perft
      .perfts(Perft.randomPerfts(238), Chess960)
      .map(assert(_))
  }
