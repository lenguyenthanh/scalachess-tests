package chess

import weaver.*
import chess.variant.*

object RandomPerftTests333 extends SimpleIOSuite:

  test("random.perft - part 333") {
    Perft
      .perfts(Perft.randomPerfts(333), Chess960)
      .map(assert(_))
  }
