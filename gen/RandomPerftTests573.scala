import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests573 extends SimpleIOSuite:

  test("random.perft - part 573") {
    Perft
      .perfts(Perft.randomPerfts(573), Chess960)
      .map(assert(_))
  }
