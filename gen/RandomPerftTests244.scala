import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests244 extends SimpleIOSuite:

  test("random.perft - part 244") {
    Perft
      .perfts(Perft.randomPerfts(244), Chess960)
      .map(assert(_))
  }
