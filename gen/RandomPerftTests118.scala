package chess

import weaver.*
import chess.variant.*

object RandomPerftTests118 extends SimpleIOSuite:

  test("random.perft - part 118") {
    Perft
      .perfts(Perft.randomPerfts(118), Chess960)
      .map(assert(_))
  }
