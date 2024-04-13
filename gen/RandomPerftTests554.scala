import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests554 extends SimpleIOSuite:

  test("random.perft - part 554") {
    Perft
      .perfts(Perft.randomPerfts(554), Chess960)
      .map(assert(_))
  }
