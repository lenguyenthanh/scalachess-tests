package chess

import weaver.*
import chess.variant.*

object RandomPerftTests302 extends SimpleIOSuite:

  test("random.perft - part 302") {
    Perft
      .perfts(Perft.randomPerfts(302), Chess960)
      .map(assert(_))
  }
