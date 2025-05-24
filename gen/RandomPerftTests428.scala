package chess

import weaver.*
import chess.variant.*

object RandomPerftTests428 extends SimpleIOSuite:

  test("random.perft - part 428") {
    Perft
      .perfts(Perft.randomPerfts(428), Chess960)
      .map(assert(_))
  }
