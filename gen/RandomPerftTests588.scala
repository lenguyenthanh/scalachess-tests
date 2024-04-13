import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests588 extends SimpleIOSuite:

  test("random.perft - part 588") {
    Perft
      .perfts(Perft.randomPerfts(588), Chess960)
      .map(assert(_))
  }
