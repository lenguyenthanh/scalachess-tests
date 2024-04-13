import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests167 extends SimpleIOSuite:

  test("random.perft - part 167") {
    Perft
      .perfts(Perft.randomPerfts(167), Chess960)
      .map(assert(_))
  }
