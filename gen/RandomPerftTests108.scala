package chess

import weaver.*
import chess.variant.*

object RandomPerftTests108 extends SimpleIOSuite:

  test("random.perft - part 108") {
    Perft
      .perfts(Perft.randomPerfts(108), Chess960)
      .map(assert(_))
  }
