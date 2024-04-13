import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests465 extends SimpleIOSuite:

  test("random.perft - part 465") {
    Perft
      .perfts(Perft.randomPerfts(465), Chess960)
      .map(assert(_))
  }
