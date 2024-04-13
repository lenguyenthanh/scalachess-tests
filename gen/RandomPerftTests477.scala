import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests477 extends SimpleIOSuite:

  test("random.perft - part 477") {
    Perft
      .perfts(Perft.randomPerfts(477), Chess960)
      .map(assert(_))
  }
