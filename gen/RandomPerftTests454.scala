import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests454 extends SimpleIOSuite:

  test("random.perft - part 454") {
    Perft
      .perfts(Perft.randomPerfts(454), Chess960)
      .map(assert(_))
  }
