import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests76 extends SimpleIOSuite:

  test("random.perft - part 76") {
    Perft
      .perfts(Perft.randomPerfts(76), Chess960)
      .map(assert(_))
  }
