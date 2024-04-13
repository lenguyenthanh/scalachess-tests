import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests448 extends SimpleIOSuite:

  test("random.perft - part 448") {
    Perft
      .perfts(Perft.randomPerfts(448), Chess960)
      .map(assert(_))
  }
