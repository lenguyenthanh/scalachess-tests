package chess

import weaver.*
import chess.variant.*

object RandomPerftTests23 extends SimpleIOSuite:

  test("random.perft - part 23") {
    Perft
      .perfts(Perft.randomPerfts(23), Chess960)
      .map(assert(_))
  }
