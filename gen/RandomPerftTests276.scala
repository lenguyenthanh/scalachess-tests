package chess

import weaver.*
import chess.variant.*

object RandomPerftTests276 extends SimpleIOSuite:

  test("random.perft - part 276") {
    Perft
      .perfts(Perft.randomPerfts(276), Chess960)
      .map(assert(_))
  }
