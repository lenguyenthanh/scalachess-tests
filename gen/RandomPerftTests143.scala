import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests143 extends SimpleIOSuite:

  test("random.perft - part 143") {
    Perft
      .perfts(Perft.randomPerfts(143), Chess960)
      .map(assert(_))
  }
