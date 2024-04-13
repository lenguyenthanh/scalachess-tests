import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests90 extends SimpleIOSuite:

  test("random.perft - part 90") {
    Perft
      .perfts(Perft.randomPerfts(90), Chess960)
      .map(assert(_))
  }
