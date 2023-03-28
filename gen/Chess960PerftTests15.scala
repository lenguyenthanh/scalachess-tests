import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests15 extends SimpleIOSuite:

  test("chess960 - part 15") {
    Perft
      .perfts(Perft.chess960(15), Chess960)
      .map(assert(_))
  }
