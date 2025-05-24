package chess

import weaver.*
import chess.variant.*

object RandomPerftTests59 extends SimpleIOSuite:

  test("random.perft - part 59") {
    Perft
      .perfts(Perft.randomPerfts(59), Chess960)
      .map(assert(_))
  }
