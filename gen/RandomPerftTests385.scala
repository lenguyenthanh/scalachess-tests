package chess

import weaver.*
import chess.variant.*

object RandomPerftTests385 extends SimpleIOSuite:

  test("random.perft - part 385") {
    Perft
      .perfts(Perft.randomPerfts(385), Chess960)
      .map(assert(_))
  }
