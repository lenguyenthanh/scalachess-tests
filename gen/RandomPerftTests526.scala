import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests526 extends SimpleIOSuite:

  test("random.perft - part 526") {
    Perft
      .perfts(Perft.randomPerfts(526), Chess960)
      .map(assert(_))
  }
