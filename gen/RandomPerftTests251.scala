package chess

import weaver.*
import chess.variant.*

object RandomPerftTests251 extends SimpleIOSuite:

  test("random.perft - part 251") {
    Perft
      .perfts(Perft.randomPerfts(251), Chess960)
      .map(assert(_))
  }
