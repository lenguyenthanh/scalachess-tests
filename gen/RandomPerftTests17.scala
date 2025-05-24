package chess

import weaver.*
import chess.variant.*

object RandomPerftTests17 extends SimpleIOSuite:

  test("random.perft - part 17") {
    Perft
      .perfts(Perft.randomPerfts(17), Chess960)
      .map(assert(_))
  }
