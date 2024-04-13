import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests230 extends SimpleIOSuite:

  test("random.perft - part 230") {
    Perft
      .perfts(Perft.randomPerfts(230), Chess960)
      .map(assert(_))
  }
