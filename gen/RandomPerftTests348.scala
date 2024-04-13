import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests348 extends SimpleIOSuite:

  test("random.perft - part 348") {
    Perft
      .perfts(Perft.randomPerfts(348), Chess960)
      .map(assert(_))
  }
