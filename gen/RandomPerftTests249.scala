import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests249 extends SimpleIOSuite:

  test("random.perft - part 249") {
    Perft
      .perfts(Perft.randomPerfts(249), Chess960)
      .map(assert(_))
  }
