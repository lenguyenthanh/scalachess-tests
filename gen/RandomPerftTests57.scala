import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests57 extends SimpleIOSuite:

  test("random.perft - part 57") {
    Perft
      .perfts(Perft.randomPerfts(57), Chess960)
      .map(assert(_))
  }
