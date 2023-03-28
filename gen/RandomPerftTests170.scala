import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests170 extends SimpleIOSuite:

  test("random.perft - part 170") {
    Perft
      .perfts(Perft.randomPerfts(170), Chess960)
      .map(assert(_))
  }
