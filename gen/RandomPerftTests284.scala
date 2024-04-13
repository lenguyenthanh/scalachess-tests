import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests284 extends SimpleIOSuite:

  test("random.perft - part 284") {
    Perft
      .perfts(Perft.randomPerfts(284), Chess960)
      .map(assert(_))
  }
