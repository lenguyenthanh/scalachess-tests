import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests415 extends SimpleIOSuite:

  test("random.perft - part 415") {
    Perft
      .perfts(Perft.randomPerfts(415), Chess960)
      .map(assert(_))
  }
