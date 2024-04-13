import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests29 extends SimpleIOSuite:

  test("chess960 - part 29") {
    Perft
      .perfts(Perft.chess960(29), Chess960)
      .map(assert(_))
  }
