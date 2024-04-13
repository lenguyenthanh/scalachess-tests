import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests534 extends SimpleIOSuite:

  test("random.perft - part 534") {
    Perft
      .perfts(Perft.randomPerfts(534), Chess960)
      .map(assert(_))
  }
