package chess

import weaver.*
import chess.variant.*

object RandomPerftTests352 extends SimpleIOSuite:

  test("random.perft - part 352") {
    Perft
      .perfts(Perft.randomPerfts(352), Chess960)
      .map(assert(_))
  }
