import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests612 extends SimpleIOSuite:

  test("random.perft - part 612") {
    Perft
      .perfts(Perft.randomPerfts(612), Chess960)
      .map(assert(_))
  }
