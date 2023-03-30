import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests533 extends SimpleIOSuite:

  test("random.perft - part 533") {
    Perft
      .perfts(Perft.randomPerfts(533), Chess960)
      .map(assert(_))
  }
