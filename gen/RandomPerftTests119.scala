import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests119 extends SimpleIOSuite:

  test("random.perft - part 119") {
    Perft
      .perfts(Perft.randomPerfts(119), Chess960)
      .map(assert(_))
  }
