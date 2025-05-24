package chess

import weaver.*
import chess.variant.*

object RandomPerftTests263 extends SimpleIOSuite:

  test("random.perft - part 263") {
    Perft
      .perfts(Perft.randomPerfts(263), Chess960)
      .map(assert(_))
  }
