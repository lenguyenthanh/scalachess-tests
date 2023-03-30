import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests562 extends SimpleIOSuite:

  test("random.perft - part 562") {
    Perft
      .perfts(Perft.randomPerfts(562), Chess960)
      .map(assert(_))
  }
