import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests24 extends SimpleIOSuite:

  test("chess960 - part 24") {
    Perft
      .perfts(Perft.chess960(24), Chess960)
      .map(assert(_))
  }
