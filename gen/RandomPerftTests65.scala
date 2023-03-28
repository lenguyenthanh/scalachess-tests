import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests65 extends SimpleIOSuite:

  test("random.perft - part 65") {
    Perft
      .perfts(Perft.randomPerfts(65), Chess960)
      .map(assert(_))
  }
