package chess

import weaver.*
import chess.variant.*

object RandomPerftTests146 extends SimpleIOSuite:

  test("random.perft - part 146") {
    Perft
      .perfts(Perft.randomPerfts(146), Chess960)
      .map(assert(_))
  }
