import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests516 extends SimpleIOSuite:

  test("random.perft - part 516") {
    Perft
      .perfts(Perft.randomPerfts(516), Chess960)
      .map(assert(_))
  }
