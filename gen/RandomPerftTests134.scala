import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests134 extends SimpleIOSuite:

  test("random.perft - part 134") {
    Perft
      .perfts(Perft.randomPerfts(134), Chess960)
      .map(assert(_))
  }
