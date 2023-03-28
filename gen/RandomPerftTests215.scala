import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests215 extends SimpleIOSuite:

  test("random.perft - part 215") {
    Perft
      .perfts(Perft.randomPerfts(215), Chess960)
      .map(assert(_))
  }
