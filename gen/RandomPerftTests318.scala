import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests318 extends SimpleIOSuite:

  test("random.perft - part 318") {
    Perft
      .perfts(Perft.randomPerfts(318), Chess960)
      .map(assert(_))
  }
