import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests41 extends SimpleIOSuite:

  test("random.perft - part 41") {
    Perft
      .perfts(Perft.randomPerfts(41), Chess960)
      .map(assert(_))
  }
