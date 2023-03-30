import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests529 extends SimpleIOSuite:

  test("random.perft - part 529") {
    Perft
      .perfts(Perft.randomPerfts(529), Chess960)
      .map(assert(_))
  }
