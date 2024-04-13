import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests13 extends SimpleIOSuite:

  test("random.perft - part 13") {
    Perft
      .perfts(Perft.randomPerfts(13), Chess960)
      .map(assert(_))
  }
