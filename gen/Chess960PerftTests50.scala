import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests50 extends SimpleIOSuite:

  test("chess960 - part 50") {
    Perft
      .perfts(Perft.chess960(50), Chess960)
      .map(assert(_))
  }
