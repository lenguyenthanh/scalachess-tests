import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests511 extends SimpleIOSuite:

  test("random.perft - part 511") {
    Perft
      .perfts(Perft.randomPerfts(511), Chess960)
      .map(assert(_))
  }
