package chess

import weaver.*
import chess.variant.*

object RandomPerftTests50 extends SimpleIOSuite:

  test("random.perft - part 50") {
    Perft
      .perfts(Perft.randomPerfts(50), Chess960)
      .map(assert(_))
  }
