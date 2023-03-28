import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests64 extends SimpleIOSuite:

  test("random.perft - part 64") {
    Perft
      .perfts(Perft.randomPerfts(64), Chess960)
      .map(assert(_))
  }
