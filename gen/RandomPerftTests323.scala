import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests323 extends SimpleIOSuite:

  test("random.perft - part 323") {
    Perft
      .perfts(Perft.randomPerfts(323), Chess960)
      .map(assert(_))
  }
