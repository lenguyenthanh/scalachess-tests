import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests195 extends SimpleIOSuite:

  test("random.perft - part 195") {
    Perft
      .perfts(Perft.randomPerfts(195), Chess960)
      .map(assert(_))
  }
