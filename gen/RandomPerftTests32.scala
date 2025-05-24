package chess

import weaver.*
import chess.variant.*

object RandomPerftTests32 extends SimpleIOSuite:

  test("random.perft - part 32") {
    Perft
      .perfts(Perft.randomPerfts(32), Chess960)
      .map(assert(_))
  }
