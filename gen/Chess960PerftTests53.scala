import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests53 extends SimpleIOSuite:

  test("chess960 - part 53") {
    Perft
      .perfts(Perft.chess960(53), Chess960)
      .map(assert(_))
  }
