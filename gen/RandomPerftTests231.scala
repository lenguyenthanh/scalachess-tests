package chess

import weaver.*
import chess.variant.*

object RandomPerftTests231 extends SimpleIOSuite:

  test("random.perft - part 231") {
    Perft
      .perfts(Perft.randomPerfts(231), Chess960)
      .map(assert(_))
  }
