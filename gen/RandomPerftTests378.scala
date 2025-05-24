package chess

import weaver.*
import chess.variant.*

object RandomPerftTests378 extends SimpleIOSuite:

  test("random.perft - part 378") {
    Perft
      .perfts(Perft.randomPerfts(378), Chess960)
      .map(assert(_))
  }
