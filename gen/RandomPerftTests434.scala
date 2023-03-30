import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests434 extends SimpleIOSuite:

  test("random.perft - part 434") {
    Perft
      .perfts(Perft.randomPerfts(434), Chess960)
      .map(assert(_))
  }
