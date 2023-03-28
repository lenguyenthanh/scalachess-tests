import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests83 extends SimpleIOSuite:

  test("random.perft - part 83") {
    Perft
      .perfts(Perft.randomPerfts(83), Chess960)
      .map(assert(_))
  }
