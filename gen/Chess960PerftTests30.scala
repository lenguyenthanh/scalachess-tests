import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests30 extends SimpleIOSuite:

  test("chess960 - part 30") {
    Perft
      .perfts(Perft.chess960(30), Chess960)
      .map(assert(_))
  }
