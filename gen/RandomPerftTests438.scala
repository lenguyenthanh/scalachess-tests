package chess

import weaver.*
import chess.variant.*

object RandomPerftTests438 extends SimpleIOSuite:

  test("random.perft - part 438") {
    Perft
      .perfts(Perft.randomPerfts(438), Chess960)
      .map(assert(_))
  }
