import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests371 extends SimpleIOSuite:

  test("random.perft - part 371") {
    Perft
      .perfts(Perft.randomPerfts(371), Chess960)
      .map(assert(_))
  }
