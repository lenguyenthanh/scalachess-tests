package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests6 extends SimpleIOSuite:

  test("chess960 - part 6") {
    Perft
      .perfts(Perft.chess960(6), Chess960)
      .map(assert(_))
  }
