import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests394 extends SimpleIOSuite:

  test("random.perft - part 394") {
    Perft
      .perfts(Perft.randomPerfts(394), Chess960)
      .map(assert(_))
  }
