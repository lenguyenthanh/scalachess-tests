package chess

import weaver.*
import chess.variant.*

object RandomPerftTests209 extends SimpleIOSuite:

  test("random.perft - part 209") {
    Perft
      .perfts(Perft.randomPerfts(209), Chess960)
      .map(assert(_))
  }
