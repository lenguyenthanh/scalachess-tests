package chess

import weaver.*
import chess.variant.*

object RandomPerftTests292 extends SimpleIOSuite:

  test("random.perft - part 292") {
    Perft
      .perfts(Perft.randomPerfts(292), Chess960)
      .map(assert(_))
  }
