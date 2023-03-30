import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests480 extends SimpleIOSuite:

  test("random.perft - part 480") {
    Perft
      .perfts(Perft.randomPerfts(480), Chess960)
      .map(assert(_))
  }
