import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests189 extends SimpleIOSuite:

  test("random.perft - part 189") {
    Perft
      .perfts(Perft.randomPerfts(189), Chess960)
      .map(assert(_))
  }
