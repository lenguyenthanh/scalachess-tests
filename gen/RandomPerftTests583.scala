import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests583 extends SimpleIOSuite:

  test("random.perft - part 583") {
    Perft
      .perfts(Perft.randomPerfts(583), Chess960)
      .map(assert(_))
  }
