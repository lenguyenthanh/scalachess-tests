import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests487 extends SimpleIOSuite:

  test("random.perft - part 487") {
    Perft
      .perfts(Perft.randomPerfts(487), Chess960)
      .map(assert(_))
  }
