import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests121 extends SimpleIOSuite:

  test("random.perft - part 121") {
    Perft
      .perfts(Perft.randomPerfts(121), Chess960)
      .map(assert(_))
  }
