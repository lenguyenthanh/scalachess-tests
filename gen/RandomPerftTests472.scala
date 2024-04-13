import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests472 extends SimpleIOSuite:

  test("random.perft - part 472") {
    Perft
      .perfts(Perft.randomPerfts(472), Chess960)
      .map(assert(_))
  }
