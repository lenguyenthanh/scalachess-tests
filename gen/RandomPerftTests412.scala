import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests412 extends SimpleIOSuite:

  test("random.perft - part 412") {
    Perft
      .perfts(Perft.randomPerfts(412), Chess960)
      .map(assert(_))
  }
