import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests390 extends SimpleIOSuite:

  test("random.perft - part 390") {
    Perft
      .perfts(Perft.randomPerfts(390), Chess960)
      .map(assert(_))
  }
