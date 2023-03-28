import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests369 extends SimpleIOSuite:

  test("random.perft - part 369") {
    Perft
      .perfts(Perft.randomPerfts(369), Chess960)
      .map(assert(_))
  }
