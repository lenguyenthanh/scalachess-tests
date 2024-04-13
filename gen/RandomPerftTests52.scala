import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests52 extends SimpleIOSuite:

  test("random.perft - part 52") {
    Perft
      .perfts(Perft.randomPerfts(52), Chess960)
      .map(assert(_))
  }
