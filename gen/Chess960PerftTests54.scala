import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests54 extends SimpleIOSuite:

  test("chess960 - part 54") {
    Perft
      .perfts(Perft.chess960(54), Chess960)
      .map(assert(_))
  }
