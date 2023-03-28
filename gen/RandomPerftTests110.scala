import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests110 extends SimpleIOSuite:

  test("random.perft - part 110") {
    Perft
      .perfts(Perft.randomPerfts(110), Chess960)
      .map(assert(_))
  }
