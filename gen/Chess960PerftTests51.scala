import weaver.*

import chess.format.EpdFen
import chess.variant.*

object Chess960PerftTests51 extends SimpleIOSuite:

  test("chess960 - part 51") {
    Perft
      .perfts(Perft.chess960(51), Chess960)
      .map(assert(_))
  }
