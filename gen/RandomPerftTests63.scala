import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests63 extends SimpleIOSuite:

  test("random.perft - part 63") {
    Perft
      .perfts(Perft.randomPerfts(63), Chess960)
      .map(assert(_))
  }
