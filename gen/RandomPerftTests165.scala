package chess

import weaver.*
import chess.variant.*

object RandomPerftTests165 extends SimpleIOSuite:

  test("random.perft - part 165") {
    Perft
      .perfts(Perft.randomPerfts(165), Chess960)
      .map(assert(_))
  }
