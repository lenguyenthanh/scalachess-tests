import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests55 extends SimpleIOSuite:

  test("chess960 - part 55") {
    Perft
      .perfts(Perft.chess960(55), Chess960)
      .map(assert(_))
  }
