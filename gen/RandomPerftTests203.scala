package chess

import weaver.*
import chess.variant.*

object RandomPerftTests203 extends SimpleIOSuite:

  test("random.perft - part 203") {
    Perft
      .perfts(Perft.randomPerfts(203), Chess960)
      .map(assert(_))
  }
