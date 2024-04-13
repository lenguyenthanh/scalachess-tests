import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests355 extends SimpleIOSuite:

  test("random.perft - part 355") {
    Perft
      .perfts(Perft.randomPerfts(355), Chess960)
      .map(assert(_))
  }
