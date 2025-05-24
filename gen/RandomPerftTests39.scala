package chess

import weaver.*
import chess.variant.*

object RandomPerftTests39 extends SimpleIOSuite:

  test("random.perft - part 39") {
    Perft
      .perfts(Perft.randomPerfts(39), Chess960)
      .map(assert(_))
  }
