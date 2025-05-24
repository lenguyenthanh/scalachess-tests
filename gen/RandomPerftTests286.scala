package chess

import weaver.*
import chess.variant.*

object RandomPerftTests286 extends SimpleIOSuite:

  test("random.perft - part 286") {
    Perft
      .perfts(Perft.randomPerfts(286), Chess960)
      .map(assert(_))
  }
