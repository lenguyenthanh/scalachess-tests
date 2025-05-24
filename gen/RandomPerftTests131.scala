package chess

import weaver.*
import chess.variant.*

object RandomPerftTests131 extends SimpleIOSuite:

  test("random.perft - part 131") {
    Perft
      .perfts(Perft.randomPerfts(131), Chess960)
      .map(assert(_))
  }
