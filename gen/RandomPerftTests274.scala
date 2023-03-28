import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests274 extends SimpleIOSuite:

  test("random.perft - part 274") {
    Perft
      .perfts(Perft.randomPerfts(274), Chess960)
      .map(assert(_))
  }
