import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests268 extends SimpleIOSuite:

  test("random.perft - part 268") {
    Perft
      .perfts(Perft.randomPerfts(268), Chess960)
      .map(assert(_))
  }
