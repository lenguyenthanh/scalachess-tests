import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests596 extends SimpleIOSuite:

  test("random.perft - part 596") {
    Perft
      .perfts(Perft.randomPerfts(596), Chess960)
      .map(assert(_))
  }
