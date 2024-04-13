import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests325 extends SimpleIOSuite:

  test("random.perft - part 325") {
    Perft
      .perfts(Perft.randomPerfts(325), Chess960)
      .map(assert(_))
  }
