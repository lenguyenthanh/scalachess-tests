package chess

import weaver.*
import chess.variant.*

object RandomPerftTests326 extends SimpleIOSuite:

  test("random.perft - part 326") {
    Perft
      .perfts(Perft.randomPerfts(326), Chess960)
      .map(assert(_))
  }
