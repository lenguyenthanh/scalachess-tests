package chess

import weaver.*
import chess.variant.*

object RandomPerftTests61 extends SimpleIOSuite:

  test("random.perft - part 61") {
    Perft
      .perfts(Perft.randomPerfts(61), Chess960)
      .map(assert(_))
  }
