import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests65 extends SimpleIOSuite:

  test("random.perft - part 65") {
    Perft
      .perfts(Perft.randomPerfts(65), Chess960)
      .map(assert(_))
  }
