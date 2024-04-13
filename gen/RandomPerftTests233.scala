import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests233 extends SimpleIOSuite:

  test("random.perft - part 233") {
    Perft
      .perfts(Perft.randomPerfts(233), Chess960)
      .map(assert(_))
  }
