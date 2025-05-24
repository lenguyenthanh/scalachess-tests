package chess

import weaver.*
import chess.variant.*

object RandomPerftTests192 extends SimpleIOSuite:

  test("random.perft - part 192") {
    Perft
      .perfts(Perft.randomPerfts(192), Chess960)
      .map(assert(_))
  }
