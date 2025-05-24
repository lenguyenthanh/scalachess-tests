package chess

import weaver.*
import chess.variant.*

object RandomPerftTests264 extends SimpleIOSuite:

  test("random.perft - part 264") {
    Perft
      .perfts(Perft.randomPerfts(264), Chess960)
      .map(assert(_))
  }
