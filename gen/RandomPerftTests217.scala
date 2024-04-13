import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests217 extends SimpleIOSuite:

  test("random.perft - part 217") {
    Perft
      .perfts(Perft.randomPerfts(217), Chess960)
      .map(assert(_))
  }
