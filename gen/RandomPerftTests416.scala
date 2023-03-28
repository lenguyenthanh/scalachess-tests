import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests416 extends SimpleIOSuite:

  test("random.perft - part 416") {
    Perft
      .perfts(Perft.randomPerfts(416), Chess960)
      .map(assert(_))
  }
