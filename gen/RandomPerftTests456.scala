import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests456 extends SimpleIOSuite:

  test("random.perft - part 456") {
    Perft
      .perfts(Perft.randomPerfts(456), Chess960)
      .map(assert(_))
  }
