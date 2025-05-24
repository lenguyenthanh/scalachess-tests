package chess

import weaver.*
import chess.variant.*

object RandomPerftTests114 extends SimpleIOSuite:

  test("random.perft - part 114") {
    Perft
      .perfts(Perft.randomPerfts(114), Chess960)
      .map(assert(_))
  }
