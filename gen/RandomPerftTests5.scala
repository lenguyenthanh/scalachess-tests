package chess

import weaver.*
import chess.variant.*

object RandomPerftTests5 extends SimpleIOSuite:

  test("random.perft - part 5") {
    Perft
      .perfts(Perft.randomPerfts(5), Chess960)
      .map(assert(_))
  }
