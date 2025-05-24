package chess

import weaver.*
import chess.variant.*

object RandomPerftTests257 extends SimpleIOSuite:

  test("random.perft - part 257") {
    Perft
      .perfts(Perft.randomPerfts(257), Chess960)
      .map(assert(_))
  }
