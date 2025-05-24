package chess

import weaver.*
import chess.variant.*

object RandomPerftTests357 extends SimpleIOSuite:

  test("random.perft - part 357") {
    Perft
      .perfts(Perft.randomPerfts(357), Chess960)
      .map(assert(_))
  }
