import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests191 extends SimpleIOSuite:

  test("random.perft - part 191") {
    Perft
      .perfts(Perft.randomPerfts(191), Chess960)
      .map(assert(_))
  }
