import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests242 extends SimpleIOSuite:

  test("random.perft - part 242") {
    Perft
      .perfts(Perft.randomPerfts(242), Chess960)
      .map(assert(_))
  }
