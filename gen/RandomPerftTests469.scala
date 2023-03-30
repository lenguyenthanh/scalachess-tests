import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests469 extends SimpleIOSuite:

  test("random.perft - part 469") {
    Perft
      .perfts(Perft.randomPerfts(469), Chess960)
      .map(assert(_))
  }
