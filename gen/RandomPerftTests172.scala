import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests172 extends SimpleIOSuite:

  test("random.perft - part 172") {
    Perft
      .perfts(Perft.randomPerfts(172), Chess960)
      .map(assert(_))
  }
