package chess

import weaver.*
import chess.variant.*

object RandomPerftTests127 extends SimpleIOSuite:

  test("random.perft - part 127") {
    Perft
      .perfts(Perft.randomPerfts(127), Chess960)
      .map(assert(_))
  }
