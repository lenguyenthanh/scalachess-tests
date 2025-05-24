package chess

import weaver.*
import chess.variant.*

object RandomPerftTests345 extends SimpleIOSuite:

  test("random.perft - part 345") {
    Perft
      .perfts(Perft.randomPerfts(345), Chess960)
      .map(assert(_))
  }
