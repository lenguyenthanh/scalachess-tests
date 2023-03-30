import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests430 extends SimpleIOSuite:

  test("random.perft - part 430") {
    Perft
      .perfts(Perft.randomPerfts(430), Chess960)
      .map(assert(_))
  }
