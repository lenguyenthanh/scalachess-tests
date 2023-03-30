import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests563 extends SimpleIOSuite:

  test("random.perft - part 563") {
    Perft
      .perfts(Perft.randomPerfts(563), Chess960)
      .map(assert(_))
  }
