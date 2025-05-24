package chess

import weaver.*
import chess.variant.*

object RandomPerftTests347 extends SimpleIOSuite:

  test("random.perft - part 347") {
    Perft
      .perfts(Perft.randomPerfts(347), Chess960)
      .map(assert(_))
  }
