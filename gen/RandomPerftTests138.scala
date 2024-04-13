import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests138 extends SimpleIOSuite:

  test("random.perft - part 138") {
    Perft
      .perfts(Perft.randomPerfts(138), Chess960)
      .map(assert(_))
  }
