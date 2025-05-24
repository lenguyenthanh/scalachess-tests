package chess

import weaver.*
import chess.variant.*

object RandomPerftTests280 extends SimpleIOSuite:

  test("random.perft - part 280") {
    Perft
      .perfts(Perft.randomPerfts(280), Chess960)
      .map(assert(_))
  }
