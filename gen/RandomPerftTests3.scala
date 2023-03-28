import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests3 extends SimpleIOSuite:

  test("random.perft - part 3") {
    Perft
      .perfts(Perft.randomPerfts(3), Chess960)
      .map(assert(_))
  }
