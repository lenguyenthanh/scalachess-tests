import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests543 extends SimpleIOSuite:

  test("random.perft - part 543") {
    Perft
      .perfts(Perft.randomPerfts(543), Chess960)
      .map(assert(_))
  }
