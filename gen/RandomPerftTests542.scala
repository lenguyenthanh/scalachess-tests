import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests542 extends SimpleIOSuite:

  test("random.perft - part 542") {
    Perft
      .perfts(Perft.randomPerfts(542), Chess960)
      .map(assert(_))
  }
