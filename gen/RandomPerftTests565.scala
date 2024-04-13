import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests565 extends SimpleIOSuite:

  test("random.perft - part 565") {
    Perft
      .perfts(Perft.randomPerfts(565), Chess960)
      .map(assert(_))
  }
