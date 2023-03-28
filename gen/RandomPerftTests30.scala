import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests30 extends SimpleIOSuite:

  test("random.perft - part 30") {
    Perft
      .perfts(Perft.randomPerfts(30), Chess960)
      .map(assert(_))
  }
