import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests420 extends SimpleIOSuite:

  test("random.perft - part 420") {
    Perft
      .perfts(Perft.randomPerfts(420), Chess960)
      .map(assert(_))
  }
