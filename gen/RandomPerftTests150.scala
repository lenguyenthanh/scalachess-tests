package chess

import weaver.*
import chess.variant.*

object RandomPerftTests150 extends SimpleIOSuite:

  test("random.perft - part 150") {
    Perft
      .perfts(Perft.randomPerfts(150), Chess960)
      .map(assert(_))
  }
