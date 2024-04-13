import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests3 extends SimpleIOSuite:

  test("chess960 - part 3") {
    Perft
      .perfts(Perft.chess960(3), Chess960)
      .map(assert(_))
  }
