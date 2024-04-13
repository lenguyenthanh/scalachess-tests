import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests38 extends SimpleIOSuite:

  test("chess960 - part 38") {
    Perft
      .perfts(Perft.chess960(38), Chess960)
      .map(assert(_))
  }
