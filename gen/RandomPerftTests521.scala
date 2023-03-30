import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests521 extends SimpleIOSuite:

  test("random.perft - part 521") {
    Perft
      .perfts(Perft.randomPerfts(521), Chess960)
      .map(assert(_))
  }
