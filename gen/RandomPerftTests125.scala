package chess

import weaver.*
import chess.variant.*

object RandomPerftTests125 extends SimpleIOSuite:

  test("random.perft - part 125") {
    Perft
      .perfts(Perft.randomPerfts(125), Chess960)
      .map(assert(_))
  }
