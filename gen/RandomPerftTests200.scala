import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests200 extends SimpleIOSuite:

  test("random.perft - part 200") {
    Perft
      .perfts(Perft.randomPerfts(200), Chess960)
      .map(assert(_))
  }
