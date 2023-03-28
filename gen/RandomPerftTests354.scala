import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests354 extends SimpleIOSuite:

  test("random.perft - part 354") {
    Perft
      .perfts(Perft.randomPerfts(354), Chess960)
      .map(assert(_))
  }
