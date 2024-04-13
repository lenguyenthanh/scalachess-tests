import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests294 extends SimpleIOSuite:

  test("random.perft - part 294") {
    Perft
      .perfts(Perft.randomPerfts(294), Chess960)
      .map(assert(_))
  }
