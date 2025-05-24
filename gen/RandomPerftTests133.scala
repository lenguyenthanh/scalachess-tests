package chess

import weaver.*
import chess.variant.*

object RandomPerftTests133 extends SimpleIOSuite:

  test("random.perft - part 133") {
    Perft
      .perfts(Perft.randomPerfts(133), Chess960)
      .map(assert(_))
  }
