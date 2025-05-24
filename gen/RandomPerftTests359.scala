package chess

import weaver.*
import chess.variant.*

object RandomPerftTests359 extends SimpleIOSuite:

  test("random.perft - part 359") {
    Perft
      .perfts(Perft.randomPerfts(359), Chess960)
      .map(assert(_))
  }
