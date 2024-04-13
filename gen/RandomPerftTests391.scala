import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests391 extends SimpleIOSuite:

  test("random.perft - part 391") {
    Perft
      .perfts(Perft.randomPerfts(391), Chess960)
      .map(assert(_))
  }
