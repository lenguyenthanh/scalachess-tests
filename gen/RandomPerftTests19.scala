import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests19 extends SimpleIOSuite:

  test("random.perft - part 19") {
    Perft
      .perfts(Perft.randomPerfts(19), Chess960)
      .map(assert(_))
  }
