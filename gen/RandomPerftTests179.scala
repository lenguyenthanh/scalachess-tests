package chess

import weaver.*
import chess.variant.*

object RandomPerftTests179 extends SimpleIOSuite:

  test("random.perft - part 179") {
    Perft
      .perfts(Perft.randomPerfts(179), Chess960)
      .map(assert(_))
  }
