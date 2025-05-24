package chess

import weaver.*
import chess.variant.*

object RandomPerftTests180 extends SimpleIOSuite:

  test("random.perft - part 180") {
    Perft
      .perfts(Perft.randomPerfts(180), Chess960)
      .map(assert(_))
  }
