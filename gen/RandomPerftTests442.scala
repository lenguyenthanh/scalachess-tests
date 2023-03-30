import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests442 extends SimpleIOSuite:

  test("random.perft - part 442") {
    Perft
      .perfts(Perft.randomPerfts(442), Chess960)
      .map(assert(_))
  }
