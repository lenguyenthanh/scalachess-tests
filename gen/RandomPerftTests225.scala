package chess

import weaver.*
import chess.variant.*

object RandomPerftTests225 extends SimpleIOSuite:

  test("random.perft - part 225") {
    Perft
      .perfts(Perft.randomPerfts(225), Chess960)
      .map(assert(_))
  }
