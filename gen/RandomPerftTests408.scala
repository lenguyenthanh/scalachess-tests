package chess

import weaver.*
import chess.variant.*

object RandomPerftTests408 extends SimpleIOSuite:

  test("random.perft - part 408") {
    Perft
      .perfts(Perft.randomPerfts(408), Chess960)
      .map(assert(_))
  }
