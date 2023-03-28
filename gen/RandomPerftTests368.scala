import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests368 extends SimpleIOSuite:

  test("random.perft - part 368") {
    Perft
      .perfts(Perft.randomPerfts(368), Chess960)
      .map(assert(_))
  }
