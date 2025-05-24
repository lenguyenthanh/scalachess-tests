package chess

import weaver.*
import chess.variant.*

object RandomPerftTests14 extends SimpleIOSuite:

  test("random.perft - part 14") {
    Perft
      .perfts(Perft.randomPerfts(14), Chess960)
      .map(assert(_))
  }
