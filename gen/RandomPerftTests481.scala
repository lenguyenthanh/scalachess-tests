import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests481 extends SimpleIOSuite:

  test("random.perft - part 481") {
    Perft
      .perfts(Perft.randomPerfts(481), Chess960)
      .map(assert(_))
  }
