import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests69 extends SimpleIOSuite:

  test("random.perft - part 69") {
    Perft
      .perfts(Perft.randomPerfts(69), Chess960)
      .map(assert(_))
  }
