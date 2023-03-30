import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests593 extends SimpleIOSuite:

  test("random.perft - part 593") {
    Perft
      .perfts(Perft.randomPerfts(593), Chess960)
      .map(assert(_))
  }
