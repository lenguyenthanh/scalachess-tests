import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests100 extends SimpleIOSuite:

  test("random.perft - part 100") {
    Perft
      .perfts(Perft.randomPerfts(100), Chess960)
      .map(assert(_))
  }
