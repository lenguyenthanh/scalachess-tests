import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests153 extends SimpleIOSuite:

  test("random.perft - part 153") {
    Perft
      .perfts(Perft.randomPerfts(153), Chess960)
      .map(assert(_))
  }
