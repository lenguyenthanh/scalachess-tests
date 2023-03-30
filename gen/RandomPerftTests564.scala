import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests564 extends SimpleIOSuite:

  test("random.perft - part 564") {
    Perft
      .perfts(Perft.randomPerfts(564), Chess960)
      .map(assert(_))
  }
