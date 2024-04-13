import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests598 extends SimpleIOSuite:

  test("random.perft - part 598") {
    Perft
      .perfts(Perft.randomPerfts(598), Chess960)
      .map(assert(_))
  }
