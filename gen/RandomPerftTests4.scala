import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests4 extends SimpleIOSuite:

  test("random.perft - part 4") {
    Perft
      .perfts(Perft.randomPerfts(4), Chess960)
      .map(assert(_))
  }
