import weaver.*

import chess.format.FullFen
import chess.variant.*

object Chess960PerftTests34 extends SimpleIOSuite:

  test("chess960 - part 34") {
    Perft
      .perfts(Perft.chess960(34), Chess960)
      .map(assert(_))
  }
