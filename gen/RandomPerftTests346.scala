package chess

import weaver.*
import chess.variant.*

object RandomPerftTests346 extends SimpleIOSuite:

  test("random.perft - part 346") {
    Perft
      .perfts(Perft.randomPerfts(346), Chess960)
      .map(assert(_))
  }
