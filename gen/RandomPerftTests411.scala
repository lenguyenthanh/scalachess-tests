package chess

import weaver.*
import chess.variant.*

object RandomPerftTests411 extends SimpleIOSuite:

  test("random.perft - part 411") {
    Perft
      .perfts(Perft.randomPerfts(411), Chess960)
      .map(assert(_))
  }
