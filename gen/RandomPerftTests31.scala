import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests31 extends SimpleIOSuite:

  test("random.perft - part 31") {
    Perft
      .perfts(Perft.randomPerfts(31), Chess960)
      .map(assert(_))
  }
