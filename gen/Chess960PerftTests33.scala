import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests33 extends SimpleIOSuite:

  test("chess960 - part 33") {
    Perft
      .perfts(Perft.chess960(33), Chess960)
      .map(assert(_))
  }
