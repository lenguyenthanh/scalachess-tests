package chess

import weaver.*
import chess.variant.*

object RandomPerftTests335 extends SimpleIOSuite:

  test("random.perft - part 335") {
    Perft
      .perfts(Perft.randomPerfts(335), Chess960)
      .map(assert(_))
  }
