import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests199 extends SimpleIOSuite:

  test("random.perft - part 199") {
    Perft
      .perfts(Perft.randomPerfts(199), Chess960)
      .map(assert(_))
  }
