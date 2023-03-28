import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests47 extends SimpleIOSuite:

  test("random.perft - part 47") {
    Perft
      .perfts(Perft.randomPerfts(47), Chess960)
      .map(assert(_))
  }
