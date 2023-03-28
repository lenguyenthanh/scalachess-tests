import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests388 extends SimpleIOSuite:

  test("random.perft - part 388") {
    Perft
      .perfts(Perft.randomPerfts(388), Chess960)
      .map(assert(_))
  }
