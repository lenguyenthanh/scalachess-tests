import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests229 extends SimpleIOSuite:

  test("random.perft - part 229") {
    Perft
      .perfts(Perft.randomPerfts(229), Chess960)
      .map(assert(_))
  }
