import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests310 extends SimpleIOSuite:

  test("random.perft - part 310") {
    Perft
      .perfts(Perft.randomPerfts(310), Chess960)
      .map(assert(_))
  }
