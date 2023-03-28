import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests381 extends SimpleIOSuite:

  test("random.perft - part 381") {
    Perft
      .perfts(Perft.randomPerfts(381), Chess960)
      .map(assert(_))
  }
