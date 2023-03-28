import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests71 extends SimpleIOSuite:

  test("random.perft - part 71") {
    Perft
      .perfts(Perft.randomPerfts(71), Chess960)
      .map(assert(_))
  }
