import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests56 extends SimpleIOSuite:

  test("random.perft - part 56") {
    Perft
      .perfts(Perft.randomPerfts(56), Chess960)
      .map(assert(_))
  }
