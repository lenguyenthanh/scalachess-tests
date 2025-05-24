package chess

import weaver.*
import chess.variant.*

object RandomPerftTests141 extends SimpleIOSuite:

  test("random.perft - part 141") {
    Perft
      .perfts(Perft.randomPerfts(141), Chess960)
      .map(assert(_))
  }
