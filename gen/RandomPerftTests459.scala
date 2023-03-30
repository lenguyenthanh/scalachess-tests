import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests459 extends SimpleIOSuite:

  test("random.perft - part 459") {
    Perft
      .perfts(Perft.randomPerfts(459), Chess960)
      .map(assert(_))
  }
