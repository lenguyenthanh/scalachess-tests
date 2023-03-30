import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests560 extends SimpleIOSuite:

  test("random.perft - part 560") {
    Perft
      .perfts(Perft.randomPerfts(560), Chess960)
      .map(assert(_))
  }
