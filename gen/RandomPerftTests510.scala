import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests510 extends SimpleIOSuite:

  test("random.perft - part 510") {
    Perft
      .perfts(Perft.randomPerfts(510), Chess960)
      .map(assert(_))
  }
