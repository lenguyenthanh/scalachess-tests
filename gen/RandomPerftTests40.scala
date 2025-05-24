package chess

import weaver.*
import chess.variant.*

object RandomPerftTests40 extends SimpleIOSuite:

  test("random.perft - part 40") {
    Perft
      .perfts(Perft.randomPerfts(40), Chess960)
      .map(assert(_))
  }
