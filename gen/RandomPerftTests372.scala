package chess

import weaver.*
import chess.variant.*

object RandomPerftTests372 extends SimpleIOSuite:

  test("random.perft - part 372") {
    Perft
      .perfts(Perft.randomPerfts(372), Chess960)
      .map(assert(_))
  }
