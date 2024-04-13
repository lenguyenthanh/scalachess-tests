import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests120 extends SimpleIOSuite:

  test("random.perft - part 120") {
    Perft
      .perfts(Perft.randomPerfts(120), Chess960)
      .map(assert(_))
  }
