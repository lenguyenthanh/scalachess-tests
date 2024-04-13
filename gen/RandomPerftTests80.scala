import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests80 extends SimpleIOSuite:

  test("random.perft - part 80") {
    Perft
      .perfts(Perft.randomPerfts(80), Chess960)
      .map(assert(_))
  }
