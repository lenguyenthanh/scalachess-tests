import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests1 extends SimpleIOSuite:

  test("random.perft - part 1") {
    Perft
      .perfts(Perft.randomPerfts(1), Chess960)
      .map(assert(_))
  }
