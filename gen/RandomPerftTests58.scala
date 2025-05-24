package chess

import weaver.*
import chess.variant.*

object RandomPerftTests58 extends SimpleIOSuite:

  test("random.perft - part 58") {
    Perft
      .perfts(Perft.randomPerfts(58), Chess960)
      .map(assert(_))
  }
