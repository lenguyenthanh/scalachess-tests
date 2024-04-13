import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests265 extends SimpleIOSuite:

  test("random.perft - part 265") {
    Perft
      .perfts(Perft.randomPerfts(265), Chess960)
      .map(assert(_))
  }
