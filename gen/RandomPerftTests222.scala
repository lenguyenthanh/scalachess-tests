import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests222 extends SimpleIOSuite:

  test("random.perft - part 222") {
    Perft
      .perfts(Perft.randomPerfts(222), Chess960)
      .map(assert(_))
  }
