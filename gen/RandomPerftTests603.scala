import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests603 extends SimpleIOSuite:

  test("random.perft - part 603") {
    Perft
      .perfts(Perft.randomPerfts(603), Chess960)
      .map(assert(_))
  }
