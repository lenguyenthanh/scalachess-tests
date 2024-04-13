import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests613 extends SimpleIOSuite:

  test("random.perft - part 613") {
    Perft
      .perfts(Perft.randomPerfts(613), Chess960)
      .map(assert(_))
  }
