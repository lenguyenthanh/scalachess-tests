import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests0 extends SimpleIOSuite:

  test("chess960 - part 0") {
    Perft
      .perfts(Perft.chess960(0), Chess960)
      .map(assert(_))
  }
