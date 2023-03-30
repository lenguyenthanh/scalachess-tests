import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests609 extends SimpleIOSuite:

  test("random.perft - part 609") {
    Perft
      .perfts(Perft.randomPerfts(609), Chess960)
      .map(assert(_))
  }
