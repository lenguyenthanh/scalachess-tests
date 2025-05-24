package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests49 extends SimpleIOSuite:

  test("chess960 - part 49") {
    Perft
      .perfts(Perft.chess960(49), Chess960)
      .map(assert(_))
  }
