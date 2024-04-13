import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests283 extends SimpleIOSuite:

  test("random.perft - part 283") {
    Perft
      .perfts(Perft.randomPerfts(283), Chess960)
      .map(assert(_))
  }
