import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests46 extends SimpleIOSuite:

  test("random.perft - part 46") {
    Perft
      .perfts(Perft.randomPerfts(46), Chess960)
      .map(assert(_))
  }
