import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests17 extends SimpleIOSuite:

  test("chess960 - part 17") {
    Perft
      .perfts(Perft.chess960(17), Chess960)
      .map(assert(_))
  }
