import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests177 extends SimpleIOSuite:

  test("random.perft - part 177") {
    Perft
      .perfts(Perft.randomPerfts(177), Chess960)
      .map(assert(_))
  }
