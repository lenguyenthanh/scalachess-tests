import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests482 extends SimpleIOSuite:

  test("random.perft - part 482") {
    Perft
      .perfts(Perft.randomPerfts(482), Chess960)
      .map(assert(_))
  }
