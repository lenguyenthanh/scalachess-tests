package chess

import weaver.*
import chess.variant.*

object RandomPerftTests202 extends SimpleIOSuite:

  test("random.perft - part 202") {
    Perft
      .perfts(Perft.randomPerfts(202), Chess960)
      .map(assert(_))
  }
