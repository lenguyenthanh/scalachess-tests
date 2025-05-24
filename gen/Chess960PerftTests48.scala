package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests48 extends SimpleIOSuite:

  test("chess960 - part 48") {
    Perft
      .perfts(Perft.chess960(48), Chess960)
      .map(assert(_))
  }
