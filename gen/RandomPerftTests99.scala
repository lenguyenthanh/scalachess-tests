import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests99 extends SimpleIOSuite:

  test("random.perft - part 99") {
    Perft
      .perfts(Perft.randomPerfts(99), Chess960)
      .map(assert(_))
  }
