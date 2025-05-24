package chess

import weaver.*
import chess.variant.*

object RandomPerftTests232 extends SimpleIOSuite:

  test("random.perft - part 232") {
    Perft
      .perfts(Perft.randomPerfts(232), Chess960)
      .map(assert(_))
  }
