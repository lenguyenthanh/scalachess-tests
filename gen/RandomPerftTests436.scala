package chess

import weaver.*
import chess.variant.*

object RandomPerftTests436 extends SimpleIOSuite:

  test("random.perft - part 436") {
    Perft
      .perfts(Perft.randomPerfts(436), Chess960)
      .map(assert(_))
  }
