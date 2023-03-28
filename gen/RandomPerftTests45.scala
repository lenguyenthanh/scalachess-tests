import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests45 extends SimpleIOSuite:

  test("random.perft - part 45") {
    Perft
      .perfts(Perft.randomPerfts(45), Chess960)
      .map(assert(_))
  }
