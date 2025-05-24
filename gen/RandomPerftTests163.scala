package chess

import weaver.*
import chess.variant.*

object RandomPerftTests163 extends SimpleIOSuite:

  test("random.perft - part 163") {
    Perft
      .perfts(Perft.randomPerfts(163), Chess960)
      .map(assert(_))
  }
