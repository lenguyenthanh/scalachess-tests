import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests515 extends SimpleIOSuite:

  test("random.perft - part 515") {
    Perft
      .perfts(Perft.randomPerfts(515), Chess960)
      .map(assert(_))
  }
