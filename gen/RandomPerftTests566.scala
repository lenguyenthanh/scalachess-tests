import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests566 extends SimpleIOSuite:

  test("random.perft - part 566") {
    Perft
      .perfts(Perft.randomPerfts(566), Chess960)
      .map(assert(_))
  }
