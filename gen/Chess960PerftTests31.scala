package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests31 extends SimpleIOSuite:

  test("chess960 - part 31") {
    Perft
      .perfts(Perft.chess960(31), Chess960)
      .map(assert(_))
  }
