import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests161 extends SimpleIOSuite:

  test("random.perft - part 161") {
    Perft
      .perfts(Perft.randomPerfts(161), Chess960)
      .map(assert(_))
  }
