import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests602 extends SimpleIOSuite:

  test("random.perft - part 602") {
    Perft
      .perfts(Perft.randomPerfts(602), Chess960)
      .map(assert(_))
  }
