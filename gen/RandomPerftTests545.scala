import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests545 extends SimpleIOSuite:

  test("random.perft - part 545") {
    Perft
      .perfts(Perft.randomPerfts(545), Chess960)
      .map(assert(_))
  }
