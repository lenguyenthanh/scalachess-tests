package chess

import weaver.*
import chess.variant.*

object RandomPerftTests370 extends SimpleIOSuite:

  test("random.perft - part 370") {
    Perft
      .perfts(Perft.randomPerfts(370), Chess960)
      .map(assert(_))
  }
