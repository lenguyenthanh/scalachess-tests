import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests549 extends SimpleIOSuite:

  test("random.perft - part 549") {
    Perft
      .perfts(Perft.randomPerfts(549), Chess960)
      .map(assert(_))
  }
