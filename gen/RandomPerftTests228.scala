import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests228 extends SimpleIOSuite:

  test("random.perft - part 228") {
    Perft
      .perfts(Perft.randomPerfts(228), Chess960)
      .map(assert(_))
  }
