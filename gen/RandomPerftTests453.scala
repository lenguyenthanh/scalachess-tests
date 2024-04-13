import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests453 extends SimpleIOSuite:

  test("random.perft - part 453") {
    Perft
      .perfts(Perft.randomPerfts(453), Chess960)
      .map(assert(_))
  }
