package chess

import weaver.*
import chess.variant.*

object RandomPerftTests315 extends SimpleIOSuite:

  test("random.perft - part 315") {
    Perft
      .perfts(Perft.randomPerfts(315), Chess960)
      .map(assert(_))
  }
