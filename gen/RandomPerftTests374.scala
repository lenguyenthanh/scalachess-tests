import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests374 extends SimpleIOSuite:

  test("random.perft - part 374") {
    Perft
      .perfts(Perft.randomPerfts(374), Chess960)
      .map(assert(_))
  }
