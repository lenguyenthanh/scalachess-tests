import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests175 extends SimpleIOSuite:

  test("random.perft - part 175") {
    Perft
      .perfts(Perft.randomPerfts(175), Chess960)
      .map(assert(_))
  }
