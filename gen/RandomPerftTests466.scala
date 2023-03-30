import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests466 extends SimpleIOSuite:

  test("random.perft - part 466") {
    Perft
      .perfts(Perft.randomPerfts(466), Chess960)
      .map(assert(_))
  }
