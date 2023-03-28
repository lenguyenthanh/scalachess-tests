import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests240 extends SimpleIOSuite:

  test("random.perft - part 240") {
    Perft
      .perfts(Perft.randomPerfts(240), Chess960)
      .map(assert(_))
  }
