import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests277 extends SimpleIOSuite:

  test("random.perft - part 277") {
    Perft
      .perfts(Perft.randomPerfts(277), Chess960)
      .map(assert(_))
  }
