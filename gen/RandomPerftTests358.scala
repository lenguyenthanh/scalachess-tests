import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests358 extends SimpleIOSuite:

  test("random.perft - part 358") {
    Perft
      .perfts(Perft.randomPerfts(358), Chess960)
      .map(assert(_))
  }
