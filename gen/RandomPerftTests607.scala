import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests607 extends SimpleIOSuite:

  test("random.perft - part 607") {
    Perft
      .perfts(Perft.randomPerfts(607), Chess960)
      .map(assert(_))
  }
