import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests508 extends SimpleIOSuite:

  test("random.perft - part 508") {
    Perft
      .perfts(Perft.randomPerfts(508), Chess960)
      .map(assert(_))
  }
