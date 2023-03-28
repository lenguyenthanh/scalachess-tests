import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests235 extends SimpleIOSuite:

  test("random.perft - part 235") {
    Perft
      .perfts(Perft.randomPerfts(235), Chess960)
      .map(assert(_))
  }
