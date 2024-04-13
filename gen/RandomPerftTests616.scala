import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests616 extends SimpleIOSuite:

  test("random.perft - part 616") {
    Perft
      .perfts(Perft.randomPerfts(616), Chess960)
      .map(assert(_))
  }
