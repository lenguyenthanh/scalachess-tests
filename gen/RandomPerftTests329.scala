import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests329 extends SimpleIOSuite:

  test("random.perft - part 329") {
    Perft
      .perfts(Perft.randomPerfts(329), Chess960)
      .map(assert(_))
  }
