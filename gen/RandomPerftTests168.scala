import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests168 extends SimpleIOSuite:

  test("random.perft - part 168") {
    Perft
      .perfts(Perft.randomPerfts(168), Chess960)
      .map(assert(_))
  }
