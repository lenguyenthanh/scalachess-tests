import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests9 extends SimpleIOSuite:

  test("chess960 - part 9") {
    Perft
      .perfts(Perft.chess960(9), Chess960)
      .map(assert(_))
  }
