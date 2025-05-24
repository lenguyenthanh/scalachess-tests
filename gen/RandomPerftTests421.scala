package chess

import weaver.*
import chess.variant.*

object RandomPerftTests421 extends SimpleIOSuite:

  test("random.perft - part 421") {
    Perft
      .perfts(Perft.randomPerfts(421), Chess960)
      .map(assert(_))
  }
