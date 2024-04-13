import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests382 extends SimpleIOSuite:

  test("random.perft - part 382") {
    Perft
      .perfts(Perft.randomPerfts(382), Chess960)
      .map(assert(_))
  }
