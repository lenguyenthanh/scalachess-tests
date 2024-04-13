import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests533 extends SimpleIOSuite:

  test("random.perft - part 533") {
    Perft
      .perfts(Perft.randomPerfts(533), Chess960)
      .map(assert(_))
  }
