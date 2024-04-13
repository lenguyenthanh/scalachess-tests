import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests386 extends SimpleIOSuite:

  test("random.perft - part 386") {
    Perft
      .perfts(Perft.randomPerfts(386), Chess960)
      .map(assert(_))
  }
