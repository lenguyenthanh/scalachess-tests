package chess

import weaver.*
import chess.variant.*

object RandomPerftTests174 extends SimpleIOSuite:

  test("random.perft - part 174") {
    Perft
      .perfts(Perft.randomPerfts(174), Chess960)
      .map(assert(_))
  }
