import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests44 extends SimpleIOSuite:

  test("chess960 - part 44") {
    Perft
      .perfts(Perft.chess960(44), Chess960)
      .map(assert(_))
  }
