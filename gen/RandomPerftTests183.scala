import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests183 extends SimpleIOSuite:

  test("random.perft - part 183") {
    Perft
      .perfts(Perft.randomPerfts(183), Chess960)
      .map(assert(_))
  }
