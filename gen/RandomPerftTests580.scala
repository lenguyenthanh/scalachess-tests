import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests580 extends SimpleIOSuite:

  test("random.perft - part 580") {
    Perft
      .perfts(Perft.randomPerfts(580), Chess960)
      .map(assert(_))
  }
