package chess

import weaver.*
import chess.variant.*

object RandomPerftTests350 extends SimpleIOSuite:

  test("random.perft - part 350") {
    Perft
      .perfts(Perft.randomPerfts(350), Chess960)
      .map(assert(_))
  }
