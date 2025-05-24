package chess

import weaver.*
import chess.variant.*

object RandomPerftTests414 extends SimpleIOSuite:

  test("random.perft - part 414") {
    Perft
      .perfts(Perft.randomPerfts(414), Chess960)
      .map(assert(_))
  }
