package chess

import weaver.*
import chess.variant.*

object RandomPerftTests406 extends SimpleIOSuite:

  test("random.perft - part 406") {
    Perft
      .perfts(Perft.randomPerfts(406), Chess960)
      .map(assert(_))
  }
