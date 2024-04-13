import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests197 extends SimpleIOSuite:

  test("random.perft - part 197") {
    Perft
      .perfts(Perft.randomPerfts(197), Chess960)
      .map(assert(_))
  }
