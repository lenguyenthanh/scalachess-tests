import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests371 extends SimpleIOSuite:

  test("random.perft - part 371") {
    Perft
      .perfts(Perft.randomPerfts(371), Chess960)
      .map(assert(_))
  }
