import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests524 extends SimpleIOSuite:

  test("random.perft - part 524") {
    Perft
      .perfts(Perft.randomPerfts(524), Chess960)
      .map(assert(_))
  }
