package chess

import weaver.*
import chess.variant.*

object RandomPerftTests155 extends SimpleIOSuite:

  test("random.perft - part 155") {
    Perft
      .perfts(Perft.randomPerfts(155), Chess960)
      .map(assert(_))
  }
