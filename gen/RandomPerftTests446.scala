package chess

import weaver.*
import chess.variant.*

object RandomPerftTests446 extends SimpleIOSuite:

  test("random.perft - part 446") {
    Perft
      .perfts(Perft.randomPerfts(446), Chess960)
      .map(assert(_))
  }
