import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests185 extends SimpleIOSuite:

  test("random.perft - part 185") {
    Perft
      .perfts(Perft.randomPerfts(185), Chess960)
      .map(assert(_))
  }
