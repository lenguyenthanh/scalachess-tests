import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests171 extends SimpleIOSuite:

  test("random.perft - part 171") {
    Perft
      .perfts(Perft.randomPerfts(171), Chess960)
      .map(assert(_))
  }
