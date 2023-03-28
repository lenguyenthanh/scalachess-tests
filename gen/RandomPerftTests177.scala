import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests177 extends SimpleIOSuite:

  test("random.perft - part 177") {
    Perft
      .perfts(Perft.randomPerfts(177), Chess960)
      .map(assert(_))
  }
