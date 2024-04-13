import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests505 extends SimpleIOSuite:

  test("random.perft - part 505") {
    Perft
      .perfts(Perft.randomPerfts(505), Chess960)
      .map(assert(_))
  }
