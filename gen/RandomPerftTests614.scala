import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests614 extends SimpleIOSuite:

  test("random.perft - part 614") {
    Perft
      .perfts(Perft.randomPerfts(614), Chess960)
      .map(assert(_))
  }
