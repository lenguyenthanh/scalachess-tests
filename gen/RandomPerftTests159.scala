import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests159 extends SimpleIOSuite:

  test("random.perft - part 159") {
    Perft
      .perfts(Perft.randomPerfts(159), Chess960)
      .map(assert(_))
  }
