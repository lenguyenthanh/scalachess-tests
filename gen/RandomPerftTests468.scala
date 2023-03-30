import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests468 extends SimpleIOSuite:

  test("random.perft - part 468") {
    Perft
      .perfts(Perft.randomPerfts(468), Chess960)
      .map(assert(_))
  }
