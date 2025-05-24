package chess

import weaver.*
import chess.variant.*

object RandomPerftTests126 extends SimpleIOSuite:

  test("random.perft - part 126") {
    Perft
      .perfts(Perft.randomPerfts(126), Chess960)
      .map(assert(_))
  }
