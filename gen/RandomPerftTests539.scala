import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests539 extends SimpleIOSuite:

  test("random.perft - part 539") {
    Perft
      .perfts(Perft.randomPerfts(539), Chess960)
      .map(assert(_))
  }
