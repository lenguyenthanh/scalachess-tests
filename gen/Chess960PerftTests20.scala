import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests20 extends SimpleIOSuite:

  test("chess960 - part 20") {
    Perft
      .perfts(Perft.chess960(20), Chess960)
      .map(assert(_))
  }
