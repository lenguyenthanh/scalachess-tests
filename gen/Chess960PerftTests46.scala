import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests46 extends SimpleIOSuite:

  test("chess960 - part 46") {
    Perft
      .perfts(Perft.chess960(46), Chess960)
      .map(assert(_))
  }
