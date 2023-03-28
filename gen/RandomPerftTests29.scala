import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests29 extends SimpleIOSuite:

  test("random.perft - part 29") {
    Perft
      .perfts(Perft.randomPerfts(29), Chess960)
      .map(assert(_))
  }
