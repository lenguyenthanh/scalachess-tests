import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests334 extends SimpleIOSuite:

  test("random.perft - part 334") {
    Perft
      .perfts(Perft.randomPerfts(334), Chess960)
      .map(assert(_))
  }
