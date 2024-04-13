import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests213 extends SimpleIOSuite:

  test("random.perft - part 213") {
    Perft
      .perfts(Perft.randomPerfts(213), Chess960)
      .map(assert(_))
  }
