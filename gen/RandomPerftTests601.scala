import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests601 extends SimpleIOSuite:

  test("random.perft - part 601") {
    Perft
      .perfts(Perft.randomPerfts(601), Chess960)
      .map(assert(_))
  }
