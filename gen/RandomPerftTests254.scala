package chess

import weaver.*
import chess.variant.*

object RandomPerftTests254 extends SimpleIOSuite:

  test("random.perft - part 254") {
    Perft
      .perfts(Perft.randomPerfts(254), Chess960)
      .map(assert(_))
  }
