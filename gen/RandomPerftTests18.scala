package chess

import weaver.*
import chess.variant.*

object RandomPerftTests18 extends SimpleIOSuite:

  test("random.perft - part 18") {
    Perft
      .perfts(Perft.randomPerfts(18), Chess960)
      .map(assert(_))
  }
