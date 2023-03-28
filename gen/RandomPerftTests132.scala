import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests132 extends SimpleIOSuite:

  test("random.perft - part 132") {
    Perft
      .perfts(Perft.randomPerfts(132), Chess960)
      .map(assert(_))
  }
