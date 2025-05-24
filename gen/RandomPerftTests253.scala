package chess

import weaver.*
import chess.variant.*

object RandomPerftTests253 extends SimpleIOSuite:

  test("random.perft - part 253") {
    Perft
      .perfts(Perft.randomPerfts(253), Chess960)
      .map(assert(_))
  }
