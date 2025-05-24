package chess

import weaver.*
import chess.variant.*

object RandomPerftTests142 extends SimpleIOSuite:

  test("random.perft - part 142") {
    Perft
      .perfts(Perft.randomPerfts(142), Chess960)
      .map(assert(_))
  }
