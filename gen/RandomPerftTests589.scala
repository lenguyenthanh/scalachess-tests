import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests589 extends SimpleIOSuite:

  test("random.perft - part 589") {
    Perft
      .perfts(Perft.randomPerfts(589), Chess960)
      .map(assert(_))
  }
