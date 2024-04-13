import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests574 extends SimpleIOSuite:

  test("random.perft - part 574") {
    Perft
      .perfts(Perft.randomPerfts(574), Chess960)
      .map(assert(_))
  }
