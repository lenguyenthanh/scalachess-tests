import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests111 extends SimpleIOSuite:

  test("random.perft - part 111") {
    Perft
      .perfts(Perft.randomPerfts(111), Chess960)
      .map(assert(_))
  }
