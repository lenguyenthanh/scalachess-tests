import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests462 extends SimpleIOSuite:

  test("random.perft - part 462") {
    Perft
      .perfts(Perft.randomPerfts(462), Chess960)
      .map(assert(_))
  }
