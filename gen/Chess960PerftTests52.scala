import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests52 extends SimpleIOSuite:

  test("chess960 - part 52") {
    Perft
      .perfts(Perft.chess960(52), Chess960)
      .map(assert(_))
  }
