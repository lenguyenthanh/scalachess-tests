import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests40 extends SimpleIOSuite:

  test("chess960 - part 40") {
    Perft
      .perfts(Perft.chess960(40), Chess960)
      .map(assert(_))
  }
