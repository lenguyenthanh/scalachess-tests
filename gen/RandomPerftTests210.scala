import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests210 extends SimpleIOSuite:

  test("random.perft - part 210") {
    Perft
      .perfts(Perft.randomPerfts(210), Chess960)
      .map(assert(_))
  }
