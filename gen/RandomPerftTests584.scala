import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests584 extends SimpleIOSuite:

  test("random.perft - part 584") {
    Perft
      .perfts(Perft.randomPerfts(584), Chess960)
      .map(assert(_))
  }
