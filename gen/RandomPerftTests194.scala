import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests194 extends SimpleIOSuite:

  test("random.perft - part 194") {
    Perft
      .perfts(Perft.randomPerfts(194), Chess960)
      .map(assert(_))
  }
