package chess

import weaver.*
import chess.variant.*

object RandomPerftTests363 extends SimpleIOSuite:

  test("random.perft - part 363") {
    Perft
      .perfts(Perft.randomPerfts(363), Chess960)
      .map(assert(_))
  }
