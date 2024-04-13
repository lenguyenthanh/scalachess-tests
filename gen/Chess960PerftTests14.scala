import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests14 extends SimpleIOSuite:

  test("chess960 - part 14") {
    Perft
      .perfts(Perft.chess960(14), Chess960)
      .map(assert(_))
  }
