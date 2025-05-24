package chess

import weaver.*
import chess.variant.*

object RandomPerftTests296 extends SimpleIOSuite:

  test("random.perft - part 296") {
    Perft
      .perfts(Perft.randomPerfts(296), Chess960)
      .map(assert(_))
  }
