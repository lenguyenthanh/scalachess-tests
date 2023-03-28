import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests386 extends SimpleIOSuite:

  test("random.perft - part 386") {
    Perft
      .perfts(Perft.randomPerfts(386), Chess960)
      .map(assert(_))
  }
