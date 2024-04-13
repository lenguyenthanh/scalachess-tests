import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests101 extends SimpleIOSuite:

  test("random.perft - part 101") {
    Perft
      .perfts(Perft.randomPerfts(101), Chess960)
      .map(assert(_))
  }
