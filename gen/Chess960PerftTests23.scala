package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests23 extends SimpleIOSuite:

  test("chess960 - part 23") {
    Perft
      .perfts(Perft.chess960(23), Chess960)
      .map(assert(_))
  }
