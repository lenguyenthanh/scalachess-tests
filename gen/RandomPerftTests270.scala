package chess

import weaver.*
import chess.variant.*

object RandomPerftTests270 extends SimpleIOSuite:

  test("random.perft - part 270") {
    Perft
      .perfts(Perft.randomPerfts(270), Chess960)
      .map(assert(_))
  }
