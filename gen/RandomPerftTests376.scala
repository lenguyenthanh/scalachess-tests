import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests376 extends SimpleIOSuite:

  test("random.perft - part 376") {
    Perft
      .perfts(Perft.randomPerfts(376), Chess960)
      .map(assert(_))
  }
