import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests87 extends SimpleIOSuite:

  test("random.perft - part 87") {
    Perft
      .perfts(Perft.randomPerfts(87), Chess960)
      .map(assert(_))
  }
