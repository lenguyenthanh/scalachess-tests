import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests266 extends SimpleIOSuite:

  test("random.perft - part 266") {
    Perft
      .perfts(Perft.randomPerfts(266), Chess960)
      .map(assert(_))
  }
