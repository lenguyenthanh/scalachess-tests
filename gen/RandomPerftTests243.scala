package chess

import weaver.*
import chess.variant.*

object RandomPerftTests243 extends SimpleIOSuite:

  test("random.perft - part 243") {
    Perft
      .perfts(Perft.randomPerfts(243), Chess960)
      .map(assert(_))
  }
