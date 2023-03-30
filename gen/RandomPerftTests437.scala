import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests437 extends SimpleIOSuite:

  test("random.perft - part 437") {
    Perft
      .perfts(Perft.randomPerfts(437), Chess960)
      .map(assert(_))
  }
