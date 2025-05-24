package chess

import weaver.*
import chess.variant.*

object RandomPerftTests224 extends SimpleIOSuite:

  test("random.perft - part 224") {
    Perft
      .perfts(Perft.randomPerfts(224), Chess960)
      .map(assert(_))
  }
