import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests2 extends SimpleIOSuite:

  test("random.perft - part 2") {
    Perft
      .perfts(Perft.randomPerfts(2), Chess960)
      .map(assert(_))
  }
