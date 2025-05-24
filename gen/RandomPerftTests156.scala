package chess

import weaver.*
import chess.variant.*

object RandomPerftTests156 extends SimpleIOSuite:

  test("random.perft - part 156") {
    Perft
      .perfts(Perft.randomPerfts(156), Chess960)
      .map(assert(_))
  }
