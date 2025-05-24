package chess

import weaver.*
import chess.variant.*

object RandomPerftTests140 extends SimpleIOSuite:

  test("random.perft - part 140") {
    Perft
      .perfts(Perft.randomPerfts(140), Chess960)
      .map(assert(_))
  }
