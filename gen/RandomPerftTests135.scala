package chess

import weaver.*
import chess.variant.*

object RandomPerftTests135 extends SimpleIOSuite:

  test("random.perft - part 135") {
    Perft
      .perfts(Perft.randomPerfts(135), Chess960)
      .map(assert(_))
  }
