import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests489 extends SimpleIOSuite:

  test("random.perft - part 489") {
    Perft
      .perfts(Perft.randomPerfts(489), Chess960)
      .map(assert(_))
  }
