import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests401 extends SimpleIOSuite:

  test("random.perft - part 401") {
    Perft
      .perfts(Perft.randomPerfts(401), Chess960)
      .map(assert(_))
  }
