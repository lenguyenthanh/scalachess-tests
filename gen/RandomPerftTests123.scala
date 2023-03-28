import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests123 extends SimpleIOSuite:

  test("random.perft - part 123") {
    Perft
      .perfts(Perft.randomPerfts(123), Chess960)
      .map(assert(_))
  }
