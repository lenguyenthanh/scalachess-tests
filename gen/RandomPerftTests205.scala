import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests205 extends SimpleIOSuite:

  test("random.perft - part 205") {
    Perft
      .perfts(Perft.randomPerfts(205), Chess960)
      .map(assert(_))
  }
