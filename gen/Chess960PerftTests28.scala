package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests28 extends SimpleIOSuite:

  test("chess960 - part 28") {
    Perft
      .perfts(Perft.chess960(28), Chess960)
      .map(assert(_))
  }
