import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests151 extends SimpleIOSuite:

  test("random.perft - part 151") {
    Perft
      .perfts(Perft.randomPerfts(151), Chess960)
      .map(assert(_))
  }
