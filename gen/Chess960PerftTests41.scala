import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests41 extends SimpleIOSuite:

  test("chess960 - part 41") {
    Perft
      .perfts(Perft.chess960(41), Chess960)
      .map(assert(_))
  }
