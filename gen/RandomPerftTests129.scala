package chess

import weaver.*
import chess.variant.*

object RandomPerftTests129 extends SimpleIOSuite:

  test("random.perft - part 129") {
    Perft
      .perfts(Perft.randomPerfts(129), Chess960)
      .map(assert(_))
  }
