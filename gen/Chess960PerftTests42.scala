package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests42 extends SimpleIOSuite:

  test("chess960 - part 42") {
    Perft
      .perfts(Perft.chess960(42), Chess960)
      .map(assert(_))
  }
