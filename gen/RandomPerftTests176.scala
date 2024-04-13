import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests176 extends SimpleIOSuite:

  test("random.perft - part 176") {
    Perft
      .perfts(Perft.randomPerfts(176), Chess960)
      .map(assert(_))
  }
