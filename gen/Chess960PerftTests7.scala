package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests7 extends SimpleIOSuite:

  test("chess960 - part 7") {
    Perft
      .perfts(Perft.chess960(7), Chess960)
      .map(assert(_))
  }
