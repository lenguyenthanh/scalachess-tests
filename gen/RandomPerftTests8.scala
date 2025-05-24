package chess

import weaver.*
import chess.variant.*

object RandomPerftTests8 extends SimpleIOSuite:

  test("random.perft - part 8") {
    Perft
      .perfts(Perft.randomPerfts(8), Chess960)
      .map(assert(_))
  }
