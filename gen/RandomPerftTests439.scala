import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests439 extends SimpleIOSuite:

  test("random.perft - part 439") {
    Perft
      .perfts(Perft.randomPerfts(439), Chess960)
      .map(assert(_))
  }
