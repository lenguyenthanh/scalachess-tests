import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests37 extends SimpleIOSuite:

  test("chess960 - part 37") {
    Perft
      .perfts(Perft.chess960(37), Chess960)
      .map(assert(_))
  }
