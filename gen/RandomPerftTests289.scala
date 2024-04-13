import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests289 extends SimpleIOSuite:

  test("random.perft - part 289") {
    Perft
      .perfts(Perft.randomPerfts(289), Chess960)
      .map(assert(_))
  }
