import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests12 extends SimpleIOSuite:

  test("random.perft - part 12") {
    Perft
      .perfts(Perft.randomPerfts(12), Chess960)
      .map(assert(_))
  }
