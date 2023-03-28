import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests327 extends SimpleIOSuite:

  test("random.perft - part 327") {
    Perft
      .perfts(Perft.randomPerfts(327), Chess960)
      .map(assert(_))
  }
