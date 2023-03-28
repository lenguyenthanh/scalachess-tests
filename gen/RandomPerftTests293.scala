import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests293 extends SimpleIOSuite:

  test("random.perft - part 293") {
    Perft
      .perfts(Perft.randomPerfts(293), Chess960)
      .map(assert(_))
  }
