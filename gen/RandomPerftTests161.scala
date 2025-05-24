package chess

import weaver.*
import chess.variant.*

object RandomPerftTests161 extends SimpleIOSuite:

  test("random.perft - part 161") {
    Perft
      .perfts(Perft.randomPerfts(161), Chess960)
      .map(assert(_))
  }
