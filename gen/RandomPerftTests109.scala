import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests109 extends SimpleIOSuite:

  test("random.perft - part 109") {
    Perft
      .perfts(Perft.randomPerfts(109), Chess960)
      .map(assert(_))
  }
