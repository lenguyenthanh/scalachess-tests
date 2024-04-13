import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests556 extends SimpleIOSuite:

  test("random.perft - part 556") {
    Perft
      .perfts(Perft.randomPerfts(556), Chess960)
      .map(assert(_))
  }
