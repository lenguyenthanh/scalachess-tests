import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests547 extends SimpleIOSuite:

  test("random.perft - part 547") {
    Perft
      .perfts(Perft.randomPerfts(547), Chess960)
      .map(assert(_))
  }
