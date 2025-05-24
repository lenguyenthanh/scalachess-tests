package chess

import weaver.*
import chess.variant.*

object RandomPerftTests22 extends SimpleIOSuite:

  test("random.perft - part 22") {
    Perft
      .perfts(Perft.randomPerfts(22), Chess960)
      .map(assert(_))
  }
