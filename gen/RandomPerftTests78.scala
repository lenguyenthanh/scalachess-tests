import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests78 extends SimpleIOSuite:

  test("random.perft - part 78") {
    Perft
      .perfts(Perft.randomPerfts(78), Chess960)
      .map(assert(_))
  }
