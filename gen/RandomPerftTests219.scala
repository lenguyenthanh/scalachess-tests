import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests219 extends SimpleIOSuite:

  test("random.perft - part 219") {
    Perft
      .perfts(Perft.randomPerfts(219), Chess960)
      .map(assert(_))
  }
