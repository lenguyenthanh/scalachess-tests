import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests66 extends SimpleIOSuite:

  test("random.perft - part 66") {
    Perft
      .perfts(Perft.randomPerfts(66), Chess960)
      .map(assert(_))
  }
