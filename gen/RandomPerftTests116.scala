import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests116 extends SimpleIOSuite:

  test("random.perft - part 116") {
    Perft
      .perfts(Perft.randomPerfts(116), Chess960)
      .map(assert(_))
  }
