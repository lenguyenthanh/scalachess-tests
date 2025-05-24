package chess

import weaver.*
import chess.variant.*

object RandomPerftTests115 extends SimpleIOSuite:

  test("random.perft - part 115") {
    Perft
      .perfts(Perft.randomPerfts(115), Chess960)
      .map(assert(_))
  }
