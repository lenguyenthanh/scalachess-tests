package chess

import weaver.*
import chess.variant.*

object RandomPerftTests26 extends SimpleIOSuite:

  test("random.perft - part 26") {
    Perft
      .perfts(Perft.randomPerfts(26), Chess960)
      .map(assert(_))
  }
