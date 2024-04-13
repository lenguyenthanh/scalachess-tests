import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests19 extends SimpleIOSuite:

  test("chess960 - part 19") {
    Perft
      .perfts(Perft.chess960(19), Chess960)
      .map(assert(_))
  }
