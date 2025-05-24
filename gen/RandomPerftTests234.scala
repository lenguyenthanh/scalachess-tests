package chess

import weaver.*
import chess.variant.*

object RandomPerftTests234 extends SimpleIOSuite:

  test("random.perft - part 234") {
    Perft
      .perfts(Perft.randomPerfts(234), Chess960)
      .map(assert(_))
  }
