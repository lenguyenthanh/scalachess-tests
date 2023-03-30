import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests455 extends SimpleIOSuite:

  test("random.perft - part 455") {
    Perft
      .perfts(Perft.randomPerfts(455), Chess960)
      .map(assert(_))
  }
