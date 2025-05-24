package chess

import weaver.*
import chess.variant.*

object RandomPerftTests218 extends SimpleIOSuite:

  test("random.perft - part 218") {
    Perft
      .perfts(Perft.randomPerfts(218), Chess960)
      .map(assert(_))
  }
