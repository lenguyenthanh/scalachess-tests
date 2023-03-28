import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests80 extends SimpleIOSuite:

  test("random.perft - part 80") {
    Perft
      .perfts(Perft.randomPerfts(80), Chess960)
      .map(assert(_))
  }
