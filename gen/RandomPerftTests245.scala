package chess

import weaver.*
import chess.variant.*

object RandomPerftTests245 extends SimpleIOSuite:

  test("random.perft - part 245") {
    Perft
      .perfts(Perft.randomPerfts(245), Chess960)
      .map(assert(_))
  }
