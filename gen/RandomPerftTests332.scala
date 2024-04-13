import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests332 extends SimpleIOSuite:

  test("random.perft - part 332") {
    Perft
      .perfts(Perft.randomPerfts(332), Chess960)
      .map(assert(_))
  }
