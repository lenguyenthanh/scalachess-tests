import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests86 extends SimpleIOSuite:

  test("random.perft - part 86") {
    Perft
      .perfts(Perft.randomPerfts(86), Chess960)
      .map(assert(_))
  }
