package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests32 extends SimpleIOSuite:

  test("chess960 - part 32") {
    Perft
      .perfts(Perft.chess960(32), Chess960)
      .map(assert(_))
  }
