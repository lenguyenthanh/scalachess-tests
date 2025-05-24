package chess

import weaver.*
import chess.variant.*

object RandomPerftTests181 extends SimpleIOSuite:

  test("random.perft - part 181") {
    Perft
      .perfts(Perft.randomPerfts(181), Chess960)
      .map(assert(_))
  }
