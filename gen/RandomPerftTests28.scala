import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests28 extends SimpleIOSuite:

  test("random.perft - part 28") {
    Perft
      .perfts(Perft.randomPerfts(28), Chess960)
      .map(assert(_))
  }
