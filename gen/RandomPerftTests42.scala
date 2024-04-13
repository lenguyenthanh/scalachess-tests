import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests42 extends SimpleIOSuite:

  test("random.perft - part 42") {
    Perft
      .perfts(Perft.randomPerfts(42), Chess960)
      .map(assert(_))
  }
