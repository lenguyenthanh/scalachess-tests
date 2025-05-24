package chess

import weaver.*
import chess.variant.*

object RandomPerftTests67 extends SimpleIOSuite:

  test("random.perft - part 67") {
    Perft
      .perfts(Perft.randomPerfts(67), Chess960)
      .map(assert(_))
  }
