package chess

import weaver.*
import chess.variant.*

object RandomPerftTests54 extends SimpleIOSuite:

  test("random.perft - part 54") {
    Perft
      .perfts(Perft.randomPerfts(54), Chess960)
      .map(assert(_))
  }
