package chess

import weaver.*
import chess.variant.*

object RandomPerftTests70 extends SimpleIOSuite:

  test("random.perft - part 70") {
    Perft
      .perfts(Perft.randomPerfts(70), Chess960)
      .map(assert(_))
  }
