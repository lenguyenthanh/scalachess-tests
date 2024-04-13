import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests432 extends SimpleIOSuite:

  test("random.perft - part 432") {
    Perft
      .perfts(Perft.randomPerfts(432), Chess960)
      .map(assert(_))
  }
