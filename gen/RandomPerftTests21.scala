package chess

import weaver.*
import chess.variant.*

object RandomPerftTests21 extends SimpleIOSuite:

  test("random.perft - part 21") {
    Perft
      .perfts(Perft.randomPerfts(21), Chess960)
      .map(assert(_))
  }
