import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests569 extends SimpleIOSuite:

  test("random.perft - part 569") {
    Perft
      .perfts(Perft.randomPerfts(569), Chess960)
      .map(assert(_))
  }
