package chess

import weaver.*
import chess.variant.*

object RandomPerftTests16 extends SimpleIOSuite:

  test("random.perft - part 16") {
    Perft
      .perfts(Perft.randomPerfts(16), Chess960)
      .map(assert(_))
  }
