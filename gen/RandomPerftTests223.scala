package chess

import weaver.*
import chess.variant.*

object RandomPerftTests223 extends SimpleIOSuite:

  test("random.perft - part 223") {
    Perft
      .perfts(Perft.randomPerfts(223), Chess960)
      .map(assert(_))
  }
