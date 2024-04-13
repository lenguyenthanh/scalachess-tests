import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests546 extends SimpleIOSuite:

  test("random.perft - part 546") {
    Perft
      .perfts(Perft.randomPerfts(546), Chess960)
      .map(assert(_))
  }
