import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests4 extends SimpleIOSuite:

  test("chess960 - part 4") {
    Perft
      .perfts(Perft.chess960(4), Chess960)
      .map(assert(_))
  }
