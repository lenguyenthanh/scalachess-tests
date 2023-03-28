import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests184 extends SimpleIOSuite:

  test("random.perft - part 184") {
    Perft
      .perfts(Perft.randomPerfts(184), Chess960)
      .map(assert(_))
  }
