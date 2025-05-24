package chess

import weaver.*
import chess.variant.*

object RandomPerftTests387 extends SimpleIOSuite:

  test("random.perft - part 387") {
    Perft
      .perfts(Perft.randomPerfts(387), Chess960)
      .map(assert(_))
  }
