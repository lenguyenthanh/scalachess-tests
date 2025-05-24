package chess

import weaver.*
import chess.variant.*

object Chess960PerftTests22 extends SimpleIOSuite:

  test("chess960 - part 22") {
    Perft
      .perfts(Perft.chess960(22), Chess960)
      .map(assert(_))
  }
