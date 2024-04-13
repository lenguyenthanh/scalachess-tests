import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests316 extends SimpleIOSuite:

  test("random.perft - part 316") {
    Perft
      .perfts(Perft.randomPerfts(316), Chess960)
      .map(assert(_))
  }
