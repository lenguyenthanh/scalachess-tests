import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests53 extends SimpleIOSuite:

  test("random.perft - part 53") {
    Perft
      .perfts(Perft.randomPerfts(53), Chess960)
      .map(assert(_))
  }
