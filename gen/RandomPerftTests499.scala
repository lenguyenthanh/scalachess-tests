import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests499 extends SimpleIOSuite:

  test("random.perft - part 499") {
    Perft
      .perfts(Perft.randomPerfts(499), Chess960)
      .map(assert(_))
  }
