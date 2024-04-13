import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests304 extends SimpleIOSuite:

  test("random.perft - part 304") {
    Perft
      .perfts(Perft.randomPerfts(304), Chess960)
      .map(assert(_))
  }
