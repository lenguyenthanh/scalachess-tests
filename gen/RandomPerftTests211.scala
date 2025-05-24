package chess

import weaver.*
import chess.variant.*

object RandomPerftTests211 extends SimpleIOSuite:

  test("random.perft - part 211") {
    Perft
      .perfts(Perft.randomPerfts(211), Chess960)
      .map(assert(_))
  }
