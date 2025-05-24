package chess

import weaver.*
import chess.variant.*

object RandomPerftTests314 extends SimpleIOSuite:

  test("random.perft - part 314") {
    Perft
      .perfts(Perft.randomPerfts(314), Chess960)
      .map(assert(_))
  }
