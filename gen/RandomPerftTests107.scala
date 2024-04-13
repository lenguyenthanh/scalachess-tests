import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests107 extends SimpleIOSuite:

  test("random.perft - part 107") {
    Perft
      .perfts(Perft.randomPerfts(107), Chess960)
      .map(assert(_))
  }
