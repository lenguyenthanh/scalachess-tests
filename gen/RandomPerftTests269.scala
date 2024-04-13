import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests269 extends SimpleIOSuite:

  test("random.perft - part 269") {
    Perft
      .perfts(Perft.randomPerfts(269), Chess960)
      .map(assert(_))
  }
