import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests328 extends SimpleIOSuite:

  test("random.perft - part 328") {
    Perft
      .perfts(Perft.randomPerfts(328), Chess960)
      .map(assert(_))
  }
