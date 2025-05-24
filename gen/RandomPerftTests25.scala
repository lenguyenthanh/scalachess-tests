package chess

import weaver.*
import chess.variant.*

object RandomPerftTests25 extends SimpleIOSuite:

  test("random.perft - part 25") {
    Perft
      .perfts(Perft.randomPerfts(25), Chess960)
      .map(assert(_))
  }
