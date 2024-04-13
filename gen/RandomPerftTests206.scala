import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests206 extends SimpleIOSuite:

  test("random.perft - part 206") {
    Perft
      .perfts(Perft.randomPerfts(206), Chess960)
      .map(assert(_))
  }
