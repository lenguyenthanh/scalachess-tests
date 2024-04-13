import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests540 extends SimpleIOSuite:

  test("random.perft - part 540") {
    Perft
      .perfts(Perft.randomPerfts(540), Chess960)
      .map(assert(_))
  }
