package chess

import weaver.*
import chess.variant.*

object RandomPerftTests196 extends SimpleIOSuite:

  test("random.perft - part 196") {
    Perft
      .perfts(Perft.randomPerfts(196), Chess960)
      .map(assert(_))
  }
