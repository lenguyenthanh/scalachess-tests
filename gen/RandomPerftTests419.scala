package chess

import weaver.*
import chess.variant.*

object RandomPerftTests419 extends SimpleIOSuite:

  test("random.perft - part 419") {
    Perft
      .perfts(Perft.randomPerfts(419), Chess960)
      .map(assert(_))
  }
