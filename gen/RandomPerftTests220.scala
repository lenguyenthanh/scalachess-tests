import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests220 extends SimpleIOSuite:

  test("random.perft - part 220") {
    Perft
      .perfts(Perft.randomPerfts(220), Chess960)
      .map(assert(_))
  }
