package chess

import weaver.*
import chess.variant.*

object RandomPerftTests106 extends SimpleIOSuite:

  test("random.perft - part 106") {
    Perft
      .perfts(Perft.randomPerfts(106), Chess960)
      .map(assert(_))
  }
