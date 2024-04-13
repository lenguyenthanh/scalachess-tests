import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests154 extends SimpleIOSuite:

  test("random.perft - part 154") {
    Perft
      .perfts(Perft.randomPerfts(154), Chess960)
      .map(assert(_))
  }
