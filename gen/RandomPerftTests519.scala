import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests519 extends SimpleIOSuite:

  test("random.perft - part 519") {
    Perft
      .perfts(Perft.randomPerfts(519), Chess960)
      .map(assert(_))
  }
