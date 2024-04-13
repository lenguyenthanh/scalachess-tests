import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests84 extends SimpleIOSuite:

  test("random.perft - part 84") {
    Perft
      .perfts(Perft.randomPerfts(84), Chess960)
      .map(assert(_))
  }
