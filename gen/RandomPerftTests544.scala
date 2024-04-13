import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests544 extends SimpleIOSuite:

  test("random.perft - part 544") {
    Perft
      .perfts(Perft.randomPerfts(544), Chess960)
      .map(assert(_))
  }
