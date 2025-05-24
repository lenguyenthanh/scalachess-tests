package chess

import weaver.*
import chess.variant.*

object RandomPerftTests341 extends SimpleIOSuite:

  test("random.perft - part 341") {
    Perft
      .perfts(Perft.randomPerfts(341), Chess960)
      .map(assert(_))
  }
