package chess

import weaver.*
import chess.variant.*

object RandomPerftTests424 extends SimpleIOSuite:

  test("random.perft - part 424") {
    Perft
      .perfts(Perft.randomPerfts(424), Chess960)
      .map(assert(_))
  }
