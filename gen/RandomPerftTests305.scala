import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests305 extends SimpleIOSuite:

  test("random.perft - part 305") {
    Perft
      .perfts(Perft.randomPerfts(305), Chess960)
      .map(assert(_))
  }
