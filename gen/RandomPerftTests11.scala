import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests11 extends SimpleIOSuite:

  test("random.perft - part 11") {
    Perft
      .perfts(Perft.randomPerfts(11), Chess960)
      .map(assert(_))
  }
