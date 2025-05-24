package chess

import weaver.*
import chess.variant.*

object RandomPerftTests35 extends SimpleIOSuite:

  test("random.perft - part 35") {
    Perft
      .perfts(Perft.randomPerfts(35), Chess960)
      .map(assert(_))
  }
