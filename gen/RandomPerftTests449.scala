package chess

import weaver.*
import chess.variant.*

object RandomPerftTests449 extends SimpleIOSuite:

  test("random.perft - part 449") {
    Perft
      .perfts(Perft.randomPerfts(449), Chess960)
      .map(assert(_))
  }
