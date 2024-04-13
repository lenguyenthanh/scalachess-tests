import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests619 extends SimpleIOSuite:

  test("random.perft - part 619") {
    Perft
      .perfts(Perft.randomPerfts(619), Chess960)
      .map(assert(_))
  }
