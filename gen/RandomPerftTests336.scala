package chess

import weaver.*
import chess.variant.*

object RandomPerftTests336 extends SimpleIOSuite:

  test("random.perft - part 336") {
    Perft
      .perfts(Perft.randomPerfts(336), Chess960)
      .map(assert(_))
  }
