package chess

import weaver.*
import chess.variant.*

object RandomPerftTests27 extends SimpleIOSuite:

  test("random.perft - part 27") {
    Perft
      .perfts(Perft.randomPerfts(27), Chess960)
      .map(assert(_))
  }
