import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests47 extends SimpleIOSuite:

  test("chess960 - part 47") {
    Perft
      .perfts(Perft.chess960(47), Chess960)
      .map(assert(_))
  }
