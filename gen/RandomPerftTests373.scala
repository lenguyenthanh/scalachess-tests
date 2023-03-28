import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests373 extends SimpleIOSuite:

  test("random.perft - part 373") {
    Perft
      .perfts(Perft.randomPerfts(373), Chess960)
      .map(assert(_))
  }
