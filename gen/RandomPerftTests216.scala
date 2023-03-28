import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests216 extends SimpleIOSuite:

  test("random.perft - part 216") {
    Perft
      .perfts(Perft.randomPerfts(216), Chess960)
      .map(assert(_))
  }
