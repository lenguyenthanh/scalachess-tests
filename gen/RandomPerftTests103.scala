import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests103 extends SimpleIOSuite:

  test("random.perft - part 103") {
    Perft
      .perfts(Perft.randomPerfts(103), Chess960)
      .map(assert(_))
  }
