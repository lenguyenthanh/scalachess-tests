import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests56 extends SimpleIOSuite:

  test("chess960 - part 56") {
    Perft
      .perfts(Perft.chess960(56), Chess960)
      .map(assert(_))
  }
