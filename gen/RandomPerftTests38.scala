import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests38 extends SimpleIOSuite:

  test("random.perft - part 38") {
    Perft
      .perfts(Perft.randomPerfts(38), Chess960)
      .map(assert(_))
  }
