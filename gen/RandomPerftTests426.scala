import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests426 extends SimpleIOSuite:

  test("random.perft - part 426") {
    Perft
      .perfts(Perft.randomPerfts(426), Chess960)
      .map(assert(_))
  }
