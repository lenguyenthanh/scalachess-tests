import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests262 extends SimpleIOSuite:

  test("random.perft - part 262") {
    Perft
      .perfts(Perft.randomPerfts(262), Chess960)
      .map(assert(_))
  }
