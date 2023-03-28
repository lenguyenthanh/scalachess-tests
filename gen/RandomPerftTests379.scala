import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests379 extends SimpleIOSuite:

  test("random.perft - part 379") {
    Perft
      .perfts(Perft.randomPerfts(379), Chess960)
      .map(assert(_))
  }
