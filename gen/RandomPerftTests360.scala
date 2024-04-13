import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests360 extends SimpleIOSuite:

  test("random.perft - part 360") {
    Perft
      .perfts(Perft.randomPerfts(360), Chess960)
      .map(assert(_))
  }
