package chess

import weaver.*
import chess.variant.*

object RandomPerftTests441 extends SimpleIOSuite:

  test("random.perft - part 441") {
    Perft
      .perfts(Perft.randomPerfts(441), Chess960)
      .map(assert(_))
  }
