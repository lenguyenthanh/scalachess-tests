package chess

import weaver.*
import chess.variant.*

object RandomPerftTests24 extends SimpleIOSuite:

  test("random.perft - part 24") {
    Perft
      .perfts(Perft.randomPerfts(24), Chess960)
      .map(assert(_))
  }
