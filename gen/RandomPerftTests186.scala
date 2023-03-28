import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests186 extends SimpleIOSuite:

  test("random.perft - part 186") {
    Perft
      .perfts(Perft.randomPerfts(186), Chess960)
      .map(assert(_))
  }
