package chess

import weaver.*
import chess.variant.*

object RandomPerftTests0 extends SimpleIOSuite:

  test("random.perft - part 0") {
    Perft
      .perfts(Perft.randomPerfts(0), Chess960)
      .map(assert(_))
  }
