package chess

import weaver.*
import chess.variant.*

object RandomPerftTests88 extends SimpleIOSuite:

  test("random.perft - part 88") {
    Perft
      .perfts(Perft.randomPerfts(88), Chess960)
      .map(assert(_))
  }
