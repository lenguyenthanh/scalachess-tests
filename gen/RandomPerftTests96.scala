import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests96 extends SimpleIOSuite:

  test("random.perft - part 96") {
    Perft
      .perfts(Perft.randomPerfts(96), Chess960)
      .map(assert(_))
  }
