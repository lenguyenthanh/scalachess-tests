import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests312 extends SimpleIOSuite:

  test("random.perft - part 312") {
    Perft
      .perfts(Perft.randomPerfts(312), Chess960)
      .map(assert(_))
  }
