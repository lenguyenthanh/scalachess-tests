import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests497 extends SimpleIOSuite:

  test("random.perft - part 497") {
    Perft
      .perfts(Perft.randomPerfts(497), Chess960)
      .map(assert(_))
  }
