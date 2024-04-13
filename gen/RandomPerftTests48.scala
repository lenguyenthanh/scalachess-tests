import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests48 extends SimpleIOSuite:

  test("random.perft - part 48") {
    Perft
      .perfts(Perft.randomPerfts(48), Chess960)
      .map(assert(_))
  }
