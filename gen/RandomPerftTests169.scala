import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests169 extends SimpleIOSuite:

  test("random.perft - part 169") {
    Perft
      .perfts(Perft.randomPerfts(169), Chess960)
      .map(assert(_))
  }
