import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests375 extends SimpleIOSuite:

  test("random.perft - part 375") {
    Perft
      .perfts(Perft.randomPerfts(375), Chess960)
      .map(assert(_))
  }
