import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests13 extends SimpleIOSuite:

  test("chess960 - part 13") {
    Perft
      .perfts(Perft.chess960(13), Chess960)
      .map(assert(_))
  }
