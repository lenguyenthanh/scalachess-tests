package chess

import weaver.*
import chess.variant.*

object RandomPerftTests324 extends SimpleIOSuite:

  test("random.perft - part 324") {
    Perft
      .perfts(Perft.randomPerfts(324), Chess960)
      .map(assert(_))
  }
