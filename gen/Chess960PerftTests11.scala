package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests11 extends SimpleIOSuite:

  test("chess960 - part 11") {
    Perft
      .perfts(Perft.chess960(11), Chess960)
      .map(assert(_))
  }
