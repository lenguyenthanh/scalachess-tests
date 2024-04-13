import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests18 extends SimpleIOSuite:

  test("chess960 - part 18") {
    Perft
      .perfts(Perft.chess960(18), Chess960)
      .map(assert(_))
  }
