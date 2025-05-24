package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests21 extends SimpleIOSuite:

  test("chess960 - part 21") {
    Perft
      .perfts(Perft.chess960(21), Chess960)
      .map(assert(_))
  }
