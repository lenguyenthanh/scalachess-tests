package chess

import weaver.*
import chess.variant.*

object RandomPerftTests112 extends SimpleIOSuite:

  test("random.perft - part 112") {
    Perft
      .perfts(Perft.randomPerfts(112), Chess960)
      .map(assert(_))
  }
