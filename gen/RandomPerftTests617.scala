import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests617 extends SimpleIOSuite:

  test("random.perft - part 617") {
    Perft
      .perfts(Perft.randomPerfts(617), Chess960)
      .map(assert(_))
  }
