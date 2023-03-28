import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests12 extends SimpleIOSuite:

  test("chess960 - part 12") {
    Perft
      .perfts(Perft.chess960(12), Chess960)
      .map(assert(_))
  }
