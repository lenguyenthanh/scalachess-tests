import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests557 extends SimpleIOSuite:

  test("random.perft - part 557") {
    Perft
      .perfts(Perft.randomPerfts(557), Chess960)
      .map(assert(_))
  }
