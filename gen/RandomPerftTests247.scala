package chess

import weaver.*
import chess.variant.*

object RandomPerftTests247 extends SimpleIOSuite:

  test("random.perft - part 247") {
    Perft
      .perfts(Perft.randomPerfts(247), Chess960)
      .map(assert(_))
  }
