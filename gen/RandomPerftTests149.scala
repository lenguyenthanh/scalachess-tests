package chess

import weaver.*
import chess.variant.*

object RandomPerftTests149 extends SimpleIOSuite:

  test("random.perft - part 149") {
    Perft
      .perfts(Perft.randomPerfts(149), Chess960)
      .map(assert(_))
  }
