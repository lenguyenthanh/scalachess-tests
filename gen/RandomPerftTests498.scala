import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests498 extends SimpleIOSuite:

  test("random.perft - part 498") {
    Perft
      .perfts(Perft.randomPerfts(498), Chess960)
      .map(assert(_))
  }
