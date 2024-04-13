import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests37 extends SimpleIOSuite:

  test("random.perft - part 37") {
    Perft
      .perfts(Perft.randomPerfts(37), Chess960)
      .map(assert(_))
  }
