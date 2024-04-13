import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests587 extends SimpleIOSuite:

  test("random.perft - part 587") {
    Perft
      .perfts(Perft.randomPerfts(587), Chess960)
      .map(assert(_))
  }
