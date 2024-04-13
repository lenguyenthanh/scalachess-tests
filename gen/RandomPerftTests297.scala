import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests297 extends SimpleIOSuite:

  test("random.perft - part 297") {
    Perft
      .perfts(Perft.randomPerfts(297), Chess960)
      .map(assert(_))
  }
