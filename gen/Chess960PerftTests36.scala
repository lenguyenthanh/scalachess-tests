package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests36 extends SimpleIOSuite:

  test("chess960 - part 36") {
    Perft
      .perfts(Perft.chess960(36), Chess960)
      .map(assert(_))
  }
