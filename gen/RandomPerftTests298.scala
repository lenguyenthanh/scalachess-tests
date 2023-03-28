import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests298 extends SimpleIOSuite:

  test("random.perft - part 298") {
    Perft
      .perfts(Perft.randomPerfts(298), Chess960)
      .map(assert(_))
  }
