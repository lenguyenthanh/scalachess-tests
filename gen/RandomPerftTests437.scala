import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests437 extends SimpleIOSuite:

  test("random.perft - part 437") {
    Perft
      .perfts(Perft.randomPerfts(437), Chess960)
      .map(assert(_))
  }
