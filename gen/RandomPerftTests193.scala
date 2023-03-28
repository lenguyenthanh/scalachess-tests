import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests193 extends SimpleIOSuite:

  test("random.perft - part 193") {
    Perft
      .perfts(Perft.randomPerfts(193), Chess960)
      .map(assert(_))
  }
