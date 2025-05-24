package chess

import weaver.*
import chess.variant.*

object RandomPerftTests43 extends SimpleIOSuite:

  test("random.perft - part 43") {
    Perft
      .perfts(Perft.randomPerfts(43), Chess960)
      .map(assert(_))
  }
