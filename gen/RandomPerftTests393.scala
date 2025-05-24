package chess

import weaver.*
import chess.variant.*

object RandomPerftTests393 extends SimpleIOSuite:

  test("random.perft - part 393") {
    Perft
      .perfts(Perft.randomPerfts(393), Chess960)
      .map(assert(_))
  }
