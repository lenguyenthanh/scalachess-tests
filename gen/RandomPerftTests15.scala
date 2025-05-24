package chess

import weaver.*
import chess.variant.*

object RandomPerftTests15 extends SimpleIOSuite:

  test("random.perft - part 15") {
    Perft
      .perfts(Perft.randomPerfts(15), Chess960)
      .map(assert(_))
  }
