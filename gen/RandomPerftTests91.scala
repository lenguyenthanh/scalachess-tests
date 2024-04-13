import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests91 extends SimpleIOSuite:

  test("random.perft - part 91") {
    Perft
      .perfts(Perft.randomPerfts(91), Chess960)
      .map(assert(_))
  }
