package chess

import weaver.*
import chess.variant.*

object RandomPerftTests397 extends SimpleIOSuite:

  test("random.perft - part 397") {
    Perft
      .perfts(Perft.randomPerfts(397), Chess960)
      .map(assert(_))
  }
