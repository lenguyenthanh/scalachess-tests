import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests362 extends SimpleIOSuite:

  test("random.perft - part 362") {
    Perft
      .perfts(Perft.randomPerfts(362), Chess960)
      .map(assert(_))
  }
