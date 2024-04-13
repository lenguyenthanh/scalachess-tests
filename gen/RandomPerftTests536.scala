import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests536 extends SimpleIOSuite:

  test("random.perft - part 536") {
    Perft
      .perfts(Perft.randomPerfts(536), Chess960)
      .map(assert(_))
  }
