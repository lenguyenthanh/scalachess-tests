import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests606 extends SimpleIOSuite:

  test("random.perft - part 606") {
    Perft
      .perfts(Perft.randomPerfts(606), Chess960)
      .map(assert(_))
  }
