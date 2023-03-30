import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests476 extends SimpleIOSuite:

  test("random.perft - part 476") {
    Perft
      .perfts(Perft.randomPerfts(476), Chess960)
      .map(assert(_))
  }
