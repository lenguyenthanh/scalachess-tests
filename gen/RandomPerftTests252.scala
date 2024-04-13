import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests252 extends SimpleIOSuite:

  test("random.perft - part 252") {
    Perft
      .perfts(Perft.randomPerfts(252), Chess960)
      .map(assert(_))
  }
