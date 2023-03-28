import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests330 extends SimpleIOSuite:

  test("random.perft - part 330") {
    Perft
      .perfts(Perft.randomPerfts(330), Chess960)
      .map(assert(_))
  }
