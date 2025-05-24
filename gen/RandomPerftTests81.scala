package chess

import weaver.*
import chess.variant.*

object RandomPerftTests81 extends SimpleIOSuite:

  test("random.perft - part 81") {
    Perft
      .perfts(Perft.randomPerfts(81), Chess960)
      .map(assert(_))
  }
