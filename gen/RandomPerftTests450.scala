import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests450 extends SimpleIOSuite:

  test("random.perft - part 450") {
    Perft
      .perfts(Perft.randomPerfts(450), Chess960)
      .map(assert(_))
  }
