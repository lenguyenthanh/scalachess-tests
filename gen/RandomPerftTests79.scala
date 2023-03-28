import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests79 extends SimpleIOSuite:

  test("random.perft - part 79") {
    Perft
      .perfts(Perft.randomPerfts(79), Chess960)
      .map(assert(_))
  }
