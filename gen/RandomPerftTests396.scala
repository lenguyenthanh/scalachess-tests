package chess

import weaver.*
import chess.variant.*

object RandomPerftTests396 extends SimpleIOSuite:

  test("random.perft - part 396") {
    Perft
      .perfts(Perft.randomPerfts(396), Chess960)
      .map(assert(_))
  }
