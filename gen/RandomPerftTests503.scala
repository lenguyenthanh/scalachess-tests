import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests503 extends SimpleIOSuite:

  test("random.perft - part 503") {
    Perft
      .perfts(Perft.randomPerfts(503), Chess960)
      .map(assert(_))
  }
