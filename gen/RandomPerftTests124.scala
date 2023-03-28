import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests124 extends SimpleIOSuite:

  test("random.perft - part 124") {
    Perft
      .perfts(Perft.randomPerfts(124), Chess960)
      .map(assert(_))
  }
