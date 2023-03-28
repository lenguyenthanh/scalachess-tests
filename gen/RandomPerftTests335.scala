import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests335 extends SimpleIOSuite:

  test("random.perft - part 335") {
    Perft
      .perfts(Perft.randomPerfts(335), Chess960)
      .map(assert(_))
  }
