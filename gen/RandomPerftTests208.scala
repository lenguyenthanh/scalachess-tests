import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests208 extends SimpleIOSuite:

  test("random.perft - part 208") {
    Perft
      .perfts(Perft.randomPerfts(208), Chess960)
      .map(assert(_))
  }
