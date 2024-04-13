import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests45 extends SimpleIOSuite:

  test("chess960 - part 45") {
    Perft
      .perfts(Perft.chess960(45), Chess960)
      .map(assert(_))
  }
