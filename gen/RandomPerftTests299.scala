package chess

import weaver.*
import chess.variant.*

object RandomPerftTests299 extends SimpleIOSuite:

  test("random.perft - part 299") {
    Perft
      .perfts(Perft.randomPerfts(299), Chess960)
      .map(assert(_))
  }
