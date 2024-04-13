import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests351 extends SimpleIOSuite:

  test("random.perft - part 351") {
    Perft
      .perfts(Perft.randomPerfts(351), Chess960)
      .map(assert(_))
  }
