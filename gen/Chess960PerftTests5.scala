import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests5 extends SimpleIOSuite:

  test("chess960 - part 5") {
    Perft
      .perfts(Perft.chess960(5), Chess960)
      .map(assert(_))
  }
