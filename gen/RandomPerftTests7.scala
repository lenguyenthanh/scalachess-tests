package chess

import weaver.*
import chess.variant.*

object RandomPerftTests7 extends SimpleIOSuite:

  test("random.perft - part 7") {
    Perft
      .perfts(Perft.randomPerfts(7), Chess960)
      .map(assert(_))
  }
