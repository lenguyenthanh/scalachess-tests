import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests10 extends SimpleIOSuite:

  test("random.perft - part 10") {
    Perft
      .perfts(Perft.randomPerfts(10), Chess960)
      .map(assert(_))
  }
