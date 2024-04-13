import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests16 extends SimpleIOSuite:

  test("chess960 - part 16") {
    Perft
      .perfts(Perft.chess960(16), Chess960)
      .map(assert(_))
  }
