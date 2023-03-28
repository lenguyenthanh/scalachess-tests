import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests338 extends SimpleIOSuite:

  test("random.perft - part 338") {
    Perft
      .perfts(Perft.randomPerfts(338), Chess960)
      .map(assert(_))
  }
