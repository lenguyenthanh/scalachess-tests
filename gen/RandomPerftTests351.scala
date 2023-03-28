import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests351 extends SimpleIOSuite:

  test("random.perft - part 351") {
    Perft
      .perfts(Perft.randomPerfts(351), Chess960)
      .map(assert(_))
  }
