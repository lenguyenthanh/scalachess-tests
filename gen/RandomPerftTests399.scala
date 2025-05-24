package chess

import weaver.*
import chess.variant.*

object RandomPerftTests399 extends SimpleIOSuite:

  test("random.perft - part 399") {
    Perft
      .perfts(Perft.randomPerfts(399), Chess960)
      .map(assert(_))
  }
