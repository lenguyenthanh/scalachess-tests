import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests604 extends SimpleIOSuite:

  test("random.perft - part 604") {
    Perft
      .perfts(Perft.randomPerfts(604), Chess960)
      .map(assert(_))
  }
