import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests207 extends SimpleIOSuite:

  test("random.perft - part 207") {
    Perft
      .perfts(Perft.randomPerfts(207), Chess960)
      .map(assert(_))
  }
