package chess

import weaver.*
import chess.variant.*

object RandomPerftTests260 extends SimpleIOSuite:

  test("random.perft - part 260") {
    Perft
      .perfts(Perft.randomPerfts(260), Chess960)
      .map(assert(_))
  }
