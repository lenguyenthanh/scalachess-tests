import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests309 extends SimpleIOSuite:

  test("random.perft - part 309") {
    Perft
      .perfts(Perft.randomPerfts(309), Chess960)
      .map(assert(_))
  }
