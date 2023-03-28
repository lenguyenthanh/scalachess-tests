import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests43 extends SimpleIOSuite:

  test("chess960 - part 43") {
    Perft
      .perfts(Perft.chess960(43), Chess960)
      .map(assert(_))
  }
