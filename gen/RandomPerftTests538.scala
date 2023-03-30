import weaver.*

import chess.format.EpdFen
import chess.variant.*

object RandomPerftTests538 extends SimpleIOSuite:

  test("random.perft - part 538") {
    Perft
      .perfts(Perft.randomPerfts(538), Chess960)
      .map(assert(_))
  }
