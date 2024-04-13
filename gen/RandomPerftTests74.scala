import weaver.*

import chess.format.FullFen
import chess.variant.*

object RandomPerftTests74 extends SimpleIOSuite:

  test("random.perft - part 74") {
    Perft
      .perfts(Perft.randomPerfts(74), Chess960)
      .map(assert(_))
  }
