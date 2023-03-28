import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests1 extends SimpleIOSuite:

  test("chess960 - part 1") {
    Perft
      .perfts(Perft.chess960(1), Chess960)
      .map(assert(_))
  }
