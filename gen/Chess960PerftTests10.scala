package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests10 extends SimpleIOSuite:

  test("chess960 - part 10") {
    Perft
      .perfts(Perft.chess960(10), Chess960)
      .map(assert(_))
  }
