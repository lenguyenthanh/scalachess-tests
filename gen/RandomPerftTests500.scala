import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests500 extends SimpleIOSuite:

  test("random.perft - part 500") {
    Perft
      .perfts(Perft.randomPerfts(500), Chess960)
      .map(assert(_))
  }
