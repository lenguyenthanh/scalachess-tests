package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests25 extends SimpleIOSuite:

  test("chess960 - part 25") {
    Perft
      .perfts(Perft.chess960(25), Chess960)
      .map(assert(_))
  }
