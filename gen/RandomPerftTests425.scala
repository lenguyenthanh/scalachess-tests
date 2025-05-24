package chess

import weaver.*
import chess.variant.*

object RandomPerftTests425 extends SimpleIOSuite:

  test("random.perft - part 425") {
    Perft
      .perfts(Perft.randomPerfts(425), Chess960)
      .map(assert(_))
  }
