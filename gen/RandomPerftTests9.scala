package chess

import weaver.*
import chess.variant.*

object RandomPerftTests9 extends SimpleIOSuite:

  test("random.perft - part 9") {
    Perft
      .perfts(Perft.randomPerfts(9), Chess960)
      .map(assert(_))
  }
