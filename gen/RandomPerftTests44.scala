package chess

import weaver.*
import chess.variant.*

object RandomPerftTests44 extends SimpleIOSuite:

  test("random.perft - part 44") {
    Perft
      .perfts(Perft.randomPerfts(44), Chess960)
      .map(assert(_))
  }
