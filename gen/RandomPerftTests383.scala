package chess

import weaver.*
import chess.variant.*

object RandomPerftTests383 extends SimpleIOSuite:

  test("random.perft - part 383") {
    Perft
      .perfts(Perft.randomPerfts(383), Chess960)
      .map(assert(_))
  }
