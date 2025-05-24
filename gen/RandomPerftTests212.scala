package chess

import weaver.*
import chess.variant.*

object RandomPerftTests212 extends SimpleIOSuite:

  test("random.perft - part 212") {
    Perft
      .perfts(Perft.randomPerfts(212), Chess960)
      .map(assert(_))
  }
