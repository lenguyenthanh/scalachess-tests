package chess

import weaver.*
import chess.variant.*

object RandomPerftTests287 extends SimpleIOSuite:

  test("random.perft - part 287") {
    Perft
      .perfts(Perft.randomPerfts(287), Chess960)
      .map(assert(_))
  }
