import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests288 extends SimpleIOSuite:

  test("random.perft - part 288") {
    Perft
      .perfts(Perft.randomPerfts(288), Chess960)
      .map(assert(_))
  }
