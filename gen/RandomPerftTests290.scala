import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests290 extends SimpleIOSuite:

  test("random.perft - part 290") {
    Perft
      .perfts(Perft.randomPerfts(290), Chess960)
      .map(assert(_))
  }
