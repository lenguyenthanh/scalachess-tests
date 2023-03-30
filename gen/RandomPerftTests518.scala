import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests518 extends SimpleIOSuite:

  test("random.perft - part 518") {
    Perft
      .perfts(Perft.randomPerfts(518), Chess960)
      .map(assert(_))
  }
