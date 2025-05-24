package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests8 extends SimpleIOSuite:

  test("chess960 - part 8") {
    Perft
      .perfts(Perft.chess960(8), Chess960)
      .map(assert(_))
  }
