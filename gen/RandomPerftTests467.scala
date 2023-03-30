import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests467 extends SimpleIOSuite:

  test("random.perft - part 467") {
    Perft
      .perfts(Perft.randomPerfts(467), Chess960)
      .map(assert(_))
  }
