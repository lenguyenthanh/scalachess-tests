package chess

import weaver.*
import chess.variant.*

object RandomPerftTests198 extends SimpleIOSuite:

  test("random.perft - part 198") {
    Perft
      .perfts(Perft.randomPerfts(198), Chess960)
      .map(assert(_))
  }
