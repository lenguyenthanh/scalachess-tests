package chess

import weaver.*
import chess.variant.*

object RandomPerftTests136 extends SimpleIOSuite:

  test("random.perft - part 136") {
    Perft
      .perfts(Perft.randomPerfts(136), Chess960)
      .map(assert(_))
  }
