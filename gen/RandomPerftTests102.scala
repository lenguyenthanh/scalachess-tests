package chess

import weaver.*
import chess.variant.*

object RandomPerftTests102 extends SimpleIOSuite:

  test("random.perft - part 102") {
    Perft
      .perfts(Perft.randomPerfts(102), Chess960)
      .map(assert(_))
  }
