import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests255 extends SimpleIOSuite:

  test("random.perft - part 255") {
    Perft
      .perfts(Perft.randomPerfts(255), Chess960)
      .map(assert(_))
  }
