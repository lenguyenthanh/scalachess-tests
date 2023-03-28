import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests342 extends SimpleIOSuite:

  test("random.perft - part 342") {
    Perft
      .perfts(Perft.randomPerfts(342), Chess960)
      .map(assert(_))
  }
