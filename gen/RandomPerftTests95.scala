import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests95 extends SimpleIOSuite:

  test("random.perft - part 95") {
    Perft
      .perfts(Perft.randomPerfts(95), Chess960)
      .map(assert(_))
  }
