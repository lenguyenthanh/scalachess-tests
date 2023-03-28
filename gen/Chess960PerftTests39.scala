import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests39 extends SimpleIOSuite:

  test("chess960 - part 39") {
    Perft
      .perfts(Perft.chess960(39), Chess960)
      .map(assert(_))
  }
