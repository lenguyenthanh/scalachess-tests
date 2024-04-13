import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests20 extends SimpleIOSuite:

  test("random.perft - part 20") {
    Perft
      .perfts(Perft.randomPerfts(20), Chess960)
      .map(assert(_))
  }
