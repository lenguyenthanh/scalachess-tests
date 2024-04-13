import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests431 extends SimpleIOSuite:

  test("random.perft - part 431") {
    Perft
      .perfts(Perft.randomPerfts(431), Chess960)
      .map(assert(_))
  }
