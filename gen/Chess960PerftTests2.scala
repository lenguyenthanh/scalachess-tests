import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests2 extends SimpleIOSuite:

  test("chess960 - part 2") {
    Perft
      .perfts(Perft.chess960(2), Chess960)
      .map(assert(_))
  }
