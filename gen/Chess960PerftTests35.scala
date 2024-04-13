import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests35 extends SimpleIOSuite:

  test("chess960 - part 35") {
    Perft
      .perfts(Perft.chess960(35), Chess960)
      .map(assert(_))
  }
