import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests246 extends SimpleIOSuite:

  test("random.perft - part 246") {
    Perft
      .perfts(Perft.randomPerfts(246), Chess960)
      .map(assert(_))
  }
