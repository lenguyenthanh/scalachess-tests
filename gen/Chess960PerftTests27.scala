package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests27 extends SimpleIOSuite:

  test("chess960 - part 27") {
    Perft
      .perfts(Perft.chess960(27), Chess960)
      .map(assert(_))
  }
