import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests485 extends SimpleIOSuite:

  test("random.perft - part 485") {
    Perft
      .perfts(Perft.randomPerfts(485), Chess960)
      .map(assert(_))
  }
