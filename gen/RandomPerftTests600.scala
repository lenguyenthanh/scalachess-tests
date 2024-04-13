import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests600 extends SimpleIOSuite:

  test("random.perft - part 600") {
    Perft
      .perfts(Perft.randomPerfts(600), Chess960)
      .map(assert(_))
  }
