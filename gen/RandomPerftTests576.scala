import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests576 extends SimpleIOSuite:

  test("random.perft - part 576") {
    Perft
      .perfts(Perft.randomPerfts(576), Chess960)
      .map(assert(_))
  }
