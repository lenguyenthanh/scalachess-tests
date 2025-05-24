package chess

import weaver.*
import chess.variant.*

object RandomPerftTests117 extends SimpleIOSuite:

  test("random.perft - part 117") {
    Perft
      .perfts(Perft.randomPerfts(117), Chess960)
      .map(assert(_))
  }
