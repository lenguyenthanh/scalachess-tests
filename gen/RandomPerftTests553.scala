import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests553 extends SimpleIOSuite:

  test("random.perft - part 553") {
    Perft
      .perfts(Perft.randomPerfts(553), Chess960)
      .map(assert(_))
  }
