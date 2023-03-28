import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests157 extends SimpleIOSuite:

  test("random.perft - part 157") {
    Perft
      .perfts(Perft.randomPerfts(157), Chess960)
      .map(assert(_))
  }
