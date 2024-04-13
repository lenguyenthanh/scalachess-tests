import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests577 extends SimpleIOSuite:

  test("random.perft - part 577") {
    Perft
      .perfts(Perft.randomPerfts(577), Chess960)
      .map(assert(_))
  }
