import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests486 extends SimpleIOSuite:

  test("random.perft - part 486") {
    Perft
      .perfts(Perft.randomPerfts(486), Chess960)
      .map(assert(_))
  }
