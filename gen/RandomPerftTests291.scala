import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests291 extends SimpleIOSuite:

  test("random.perft - part 291") {
    Perft
      .perfts(Perft.randomPerfts(291), Chess960)
      .map(assert(_))
  }
