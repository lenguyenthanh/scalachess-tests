import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests483 extends SimpleIOSuite:

  test("random.perft - part 483") {
    Perft
      .perfts(Perft.randomPerfts(483), Chess960)
      .map(assert(_))
  }
