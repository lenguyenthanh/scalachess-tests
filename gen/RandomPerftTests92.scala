import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests92 extends SimpleIOSuite:

  test("random.perft - part 92") {
    Perft
      .perfts(Perft.randomPerfts(92), Chess960)
      .map(assert(_))
  }
