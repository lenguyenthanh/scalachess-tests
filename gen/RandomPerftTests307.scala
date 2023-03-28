import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests307 extends SimpleIOSuite:

  test("random.perft - part 307") {
    Perft
      .perfts(Perft.randomPerfts(307), Chess960)
      .map(assert(_))
  }
