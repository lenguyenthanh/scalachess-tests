package chess

import weaver.*
import chess.variant.*

object RandomPerftTests236 extends SimpleIOSuite:

  test("random.perft - part 236") {
    Perft
      .perfts(Perft.randomPerfts(236), Chess960)
      .map(assert(_))
  }
