import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests610 extends SimpleIOSuite:

  test("random.perft - part 610") {
    Perft
      .perfts(Perft.randomPerfts(610), Chess960)
      .map(assert(_))
  }
