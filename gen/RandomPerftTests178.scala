import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests178 extends SimpleIOSuite:

  test("random.perft - part 178") {
    Perft
      .perfts(Perft.randomPerfts(178), Chess960)
      .map(assert(_))
  }
