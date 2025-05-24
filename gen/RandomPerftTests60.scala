package chess

import weaver.*
import chess.variant.*

object RandomPerftTests60 extends SimpleIOSuite:

  test("random.perft - part 60") {
    Perft
      .perfts(Perft.randomPerfts(60), Chess960)
      .map(assert(_))
  }
