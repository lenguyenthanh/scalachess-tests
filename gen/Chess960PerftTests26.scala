import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests26 extends SimpleIOSuite:

  test("chess960 - part 26") {
    Perft
      .perfts(Perft.chess960(26), Chess960)
      .map(assert(_))
  }
