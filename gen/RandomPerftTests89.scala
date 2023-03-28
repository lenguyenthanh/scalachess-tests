import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests89 extends SimpleIOSuite:

  test("random.perft - part 89") {
    Perft
      .perfts(Perft.randomPerfts(89), Chess960)
      .map(assert(_))
  }
