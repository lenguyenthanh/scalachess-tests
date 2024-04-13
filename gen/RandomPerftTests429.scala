import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests429 extends SimpleIOSuite:

  test("random.perft - part 429") {
    Perft
      .perfts(Perft.randomPerfts(429), Chess960)
      .map(assert(_))
  }
