import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests166 extends SimpleIOSuite:

  test("random.perft - part 166") {
    Perft
      .perfts(Perft.randomPerfts(166), Chess960)
      .map(assert(_))
  }
