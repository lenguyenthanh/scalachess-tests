import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests105 extends SimpleIOSuite:

  test("random.perft - part 105") {
    Perft
      .perfts(Perft.randomPerfts(105), Chess960)
      .map(assert(_))
  }
