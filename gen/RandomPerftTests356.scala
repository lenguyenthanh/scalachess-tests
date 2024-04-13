import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests356 extends SimpleIOSuite:

  test("random.perft - part 356") {
    Perft
      .perfts(Perft.randomPerfts(356), Chess960)
      .map(assert(_))
  }
