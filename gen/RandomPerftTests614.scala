import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests614 extends SimpleIOSuite:

  test("random.perft - part 614") {
    Perft
      .perfts(Perft.randomPerfts(614), Chess960)
      .map(assert(_))
  }
