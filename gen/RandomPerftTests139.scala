import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests139 extends SimpleIOSuite:

  test("random.perft - part 139") {
    Perft
      .perfts(Perft.randomPerfts(139), Chess960)
      .map(assert(_))
  }
